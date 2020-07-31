package com.zy.test.inner_net.schdule;

import com.xueqiu.ad.common.util.StdoutLogUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangyang01@xueqiu.com
 * @Date: 2020-07-29 21:19
 * @Param: $
 * @return $
 * @Content:
 */
@Slf4j
@Component
public class TestSchedule {


    @Scheduled(cron = "* * * * * ?")
    public void test() {
        log.info("hello", new Exception("没事儿").getStackTrace()[1]);
        log.debug("debug info", new Exception("没事儿").getStackTrace()[1]);
    }

}
