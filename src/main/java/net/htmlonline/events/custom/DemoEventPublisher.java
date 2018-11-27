package net.htmlonline.events.custom;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 事件发布类
 *
 */
//@Component
public class DemoEventPublisher implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void pushList(String msg, String mail){
        applicationContext.publishEvent(new DemoEvent(this, msg,mail));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}