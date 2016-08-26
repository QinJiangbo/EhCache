package com.qinjiangbo.service;

import net.sf.ehcache.CacheManager;

/**
 * Created by Richard on 8/26/16.
 */
public class EhCacheManager {

    public CacheManager findCacheManager() {
        CacheManager.newInstance("ehcache.xml");
        return CacheManager.create("ehcache.xml");
    }
}
