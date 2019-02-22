package com.alipay.sofa.boot.examples.demo.log;

import org.slf4j.Logger;

import com.alipay.sofa.common.log.LoggerSpaceManager;

public class DemoLoggerFactory {
	private static final String DEMO_LOG_SPACE = "com.demo";

  
    public static Logger getLogger(Class<?> clazz) {
        if (clazz == null) {
            return null;
        }
        return getLogger(clazz.getCanonicalName());
    }

    
    public static Logger getLogger(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        return LoggerSpaceManager.getLoggerBySpace(name, DEMO_LOG_SPACE);
    }
}
