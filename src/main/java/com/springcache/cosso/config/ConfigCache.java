package com.springcache.cosso.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCache {

    private static final Logger log = LoggerFactory.getLogger(ConfigCache.class);

    @Bean
    CacheManagerCustomizer<ConcurrentMapCacheManager> customizer(){ return new ConcurrentCustomizer(); }

    static class ConcurrentCustomizer implements CacheManagerCustomizer<ConcurrentMapCacheManager> {


        @Override
        public void customize(ConcurrentMapCacheManager cacheManager) {
//            cacheManager.setAllowNullValues(false);
//            cacheManager.setStoreByValue(true);
            log.info("[CONFIG - CACHE] Customize method finished.");
        }
    }
}
