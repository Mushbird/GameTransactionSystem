package com.mushbird.sinsege.base.config.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@EnableCaching
@PropertySource(value = "classpath:config/cache.properties", ignoreResourceNotFound = true)
public class MapCacheConfig {

    private static final String DELIMITER = ",";

    @Autowired
    private Environment env;

    @Bean
    public CacheManager cacheManager() {
        log.debug("[MapCacheConfig] CacheManager initialization");

        String cacheNames = env.getProperty("app.cache.map.cacheNames");
        List<ConcurrentMapCache> caches = new ArrayList<>();

        if (StringUtils.isNotEmpty(cacheNames)) {
            for (String cacheName : cacheNames.split(DELIMITER)) {
                log.debug("[MapCacheConfig] CacheName: {}", cacheName);
                caches.add(new ConcurrentMapCache(cacheName));
            }
        }

        SimpleCacheManager cacheManager = new SimpleCacheManager();
        cacheManager.setCaches(caches);

        log.debug("[MapCacheConfig] CacheManager initialization completed");
        return cacheManager;
    }

}
