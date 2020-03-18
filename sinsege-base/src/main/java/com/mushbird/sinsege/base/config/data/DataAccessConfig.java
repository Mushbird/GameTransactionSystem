package com.mushbird.sinsege.base.config.data;

import com.zaxxer.hikari.HikariDataSource;
import com.mushbird.rivendell.core.orm.mybatis.RefreshableSqlSessionFactoryBean;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@MapperScan(
        annotationClass = Mapper.class,
        sqlSessionFactoryRef = "appSqlSessionFactory",
        basePackages = {
                "com.mushbird.sinsege.base.module.**"
                , "com.mushbird.sinsege.bo.module.**"
                , "com.mushbird.sinsege.batch.interfaces.gts.**"
                , "com.mushbird.sinsege.batch.module.**"
                , "com.mushbird.sinsege.batch.settlement.**"
                , "com.mushbird.sinsege.batch.backup.gts.**"
        })
@PropertySource(value = "classpath:config/datasource.properties", ignoreResourceNotFound = true)
public class DataAccessConfig {

    @Autowired
    private Environment env;

    @Primary
    @Bean(name = "appDataSource", destroyMethod = "close")
    public HikariDataSource appDataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setPoolName(env.getProperty("app.datasource.uniqueResourceName"));
        dataSource.setDriverClassName(env.getProperty("app.datasource.driverClassName"));
        dataSource.setJdbcUrl(env.getProperty("app.datasource.url"));
        dataSource.setUsername(env.getProperty("app.datasource.username"));
        dataSource.setPassword(env.getProperty("app.datasource.password"));
        dataSource.setMinimumIdle(env.getProperty("app.datasource.minPoolSize", Integer.class));
        dataSource.setMaximumPoolSize(env.getProperty("app.datasource.maxPoolSize", Integer.class));

        return new HikariDataSource(dataSource);
    }

    @Primary
    @Bean
    public SqlSessionFactory appSqlSessionFactory(@Qualifier("appDataSource")DataSource appDataSource) throws Exception {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        RefreshableSqlSessionFactoryBean sessionFactoryBean = new RefreshableSqlSessionFactoryBean();
        sessionFactoryBean.setInterval(1000);
        sessionFactoryBean.setFailFast(true);
        sessionFactoryBean.setDataSource(appDataSource);
        sessionFactoryBean.setConfigLocation(resolver.getResource("classpath:config/mybatis.xml"));

        // Type Aliases
        String typeAliasesPackage = "com.mushbird.sinsege.base.module";
        typeAliasesPackage += ", com.mushbird.sinsege.bo.module";
        typeAliasesPackage += ", com.mushbird.sinsege.batch.interfaces.gts";
        typeAliasesPackage += ", com.mushbird.sinsege.batch.module";
        typeAliasesPackage += ", com.mushbird.sinsege.batch.settlement";
        typeAliasesPackage += ", com.mushbird.sinsege.batch.backup.gts";
        sessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);

        // XML Mapper
        Resource[] mapperXmls = resolver.getResources("classpath*:com/mushbird/sinsege/base/module/**/*.xml");
        mapperXmls = ArrayUtils.addAll(mapperXmls, resolver.getResources("classpath*:com/mushbird/sinsege/bo/module/**/*.xml"));
        mapperXmls = ArrayUtils.addAll(mapperXmls, resolver.getResources("classpath*:com/mushbird/sinsege/batch/interfaces/gts/**/*.xml"));
        mapperXmls = ArrayUtils.addAll(mapperXmls, resolver.getResources("classpath*:com/mushbird/sinsege/batch/module/**/*.xml"));
        mapperXmls = ArrayUtils.addAll(mapperXmls, resolver.getResources("classpath*:com/mushbird/sinsege/batch/settlement/**/*.xml"));
        mapperXmls = ArrayUtils.addAll(mapperXmls, resolver.getResources("classpath*:com/mushbird/sinsege/batch/backup/gts/**/*.xml"));
        sessionFactoryBean.setMapperLocations(mapperXmls);

        sessionFactoryBean.afterPropertiesSet();

        return sessionFactoryBean.getObject();
    }

    @Primary
    @Bean
    public PlatformTransactionManager appTransactionManager(@Qualifier("appDataSource")DataSource appDataSource) {
        DataSourceTransactionManager txManager = new DataSourceTransactionManager();
        txManager.setDataSource(appDataSource);

        return txManager;
    }

}