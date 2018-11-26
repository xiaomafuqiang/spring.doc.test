package net.htmlonline.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

// 创建自定义事件
// 如果发布需要调用 ApplicationEventPublisher publishEvent()
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        System.out.println(99);
    }
}
