package com.mushbird.sinsege.base.config.cache;

import java.util.Properties;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.msubird.rivendell.core.util.PropertiesUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheConfigSelector implements ImportSelector {

    /** TODO 추후 작업 필요! (import)*/
    private static Properties env = PropertiesUtils.loadProperties("config/cache.properties");

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        if (!"true".equals(env.getProperty("app.cache.enable")))
            return new String[0];

        String provider = env.getProperty("app.cache.provider");
        String clazz = null;

        // ConcurrentMapCache
        if ("map".equals(provider)) {
            clazz = MapCacheConfig.class.getName();
        }
        // Ehcache
        else if ("ehcache".equals(provider)) {
            clazz = EhCacheConfig.class.getName();
        }
        // Unknown
        else {
            throw new UnsupportedOperationException(provider);
        }

        log.debug("[CacheConfigSelector] Provider: {}, Imported class {}", provider, clazz);
        return new String[]{clazz};
    }

}
