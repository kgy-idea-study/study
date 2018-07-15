package com.aop;


import org.apache.log4j.Logger;

/**
 * @author kouguangyuan
 * @date 2018/7/12 14:02
 */
public class PerformanceImpl implements Performance {
    public static final Logger log = Logger.getLogger(PerformanceImpl.class);
    public void perform() {
        System.out.println("PerformanceImpl");
    }

    public void playTrack(int i) {
        log.info("PerformanceImpl" + i);
    }
}
