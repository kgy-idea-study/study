package com;

import com.aop.Config;
import com.aop.Performance;
import com.aop.TrackCounter;
import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author kouguangyuan
 * @date 2018/7/12 14:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class Test {

    public static final Logger log = Logger.getLogger(Test.class);

    @Autowired
    Performance performance;

    @org.junit.Test
    public void testAudience() {
        performance.perform();
    }

    @Autowired
    TrackCounter trackCounter;

    @org.junit.Test
    public void testTrackCounter() {
        performance.playTrack(1);
        performance.playTrack(2);
        performance.playTrack(3);
        performance.playTrack(3);
        performance.playTrack(3);
        performance.playTrack(3);
        performance.playTrack(7);
        performance.playTrack(7);

        log.info(trackCounter.getPlayCount(1));
        log.info(trackCounter.getPlayCount(2));
        log.info(trackCounter.getPlayCount(3));
        log.info(trackCounter.getPlayCount(4));
        log.info(trackCounter.getPlayCount(5));
        log.info(trackCounter.getPlayCount(6));
        log.info(trackCounter.getPlayCount(7));
    }
}
