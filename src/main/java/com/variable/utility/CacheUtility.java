package com.variable.utility;

import android.support.v4.util.LruCache;

/**
 * 20150802[star] Cache機制
 */
public class CacheUtility {
    private static CacheUtility instance;
    private LruCache<String, Object> cache;

    private CacheUtility() {
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        final int cacheSize = maxMemory / 8;
        cache = new LruCache<String, Object>(cacheSize);
    }

    public static CacheUtility getInstance() {
        if (instance == null)
            instance = new CacheUtility();
        return instance;
    }

    public void addToCache(String key, Object obj) {
        if (getFromCache(key) == null) {
            cache.put(key, obj);
        }
    }

    public Object getFromCache(String key) {
        return cache.get(key);
    }
}
