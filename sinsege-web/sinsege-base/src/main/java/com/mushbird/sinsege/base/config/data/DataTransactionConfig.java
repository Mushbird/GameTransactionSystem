package com.mushbird.sinsege.base.config.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Collection;
import java.util.Map;

@Slf4j
@EnableTransactionManagement(proxyTargetClass = true)
@ImportResource(value = "classpath:config/transaction.xml")
public class DataTransactionConfig {

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    @Primary
    public PlatformTransactionManager transactionManager() {
        Map<String, PlatformTransactionManager> beans = applicationContext.getBeansOfType(PlatformTransactionManager.class);
        if (beans == null || beans.size() == 0) {
            throw new IllegalArgumentException("[DataTransactionConfig] 'PlatformTransactionManager' not found");
        }

        for (String key : beans.keySet()) {
            log.debug("[DataTransactionConfig] {}={}", key, beans.get(key));
        }

        Collection<PlatformTransactionManager> values = beans.values();
        PlatformTransactionManager[] txManagers = values.toArray(new PlatformTransactionManager[0]);

        return new ChainedTransactionManager(txManagers);
    }

}
