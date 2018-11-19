package io.github.yutous.chapter2.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author yutou
 * @date 2018/11/12
 * @since 1.0.0
 */
@WebListener
@Slf4j
public class CustomListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre){
        log.info("监听器{}销毁",getClass());
    }
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("监听器{}初始化",getClass());
    }

}
