package com.mushbird.sinsege.base.config.cache;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Slf4j
@EnableCaching
@PropertySource(value = "classpath:config/cache.properties", ignoreResourceNotFound = true)
public class EhCacheConfig {

    @Autowired
    private Environment env;

    @Bean
    public CacheManager cacheManager() {
        log.debug("[EhCacheConfig] CacheManager initialization");

        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
        cacheManager.setCacheManager(cacheManagerFactoryBean().getObject());

        log.debug("[EhCacheConfig] CacheManager initialization completed");
        return cacheManager;
    }

    @Bean
    public EhCacheManagerFactoryBean cacheManagerFactoryBean() {
        PathMatchingResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();

        String configLocation = env.getProperty("app.cache.ehcache.configLocation");
        boolean shared = Boolean.valueOf(env.getProperty("app.cache.ehcache.shared", "false"));
        log.debug("[EhCacheConfig] ConfigLocation: {}, Shared: {}", configLocation, shared);

        EhCacheManagerFactoryBean factoryBean = new EhCacheManagerFactoryBean();
        factoryBean.setShared(shared);
        factoryBean.setConfigLocation(resourceResolver.getResource(configLocation));

        return factoryBean;
    }

}
