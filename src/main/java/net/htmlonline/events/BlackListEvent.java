package net.htmlonline.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.ApplicationContextEvent;

// 创建自定义事件
// 如果发布需要调用 ApplicationEventPublisher publishEvent()
public class BlackListEvent extends ApplicationContextEvent {
    private final String address;
    private final String text;


        public BlackListEvent(ApplicationContext source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

}
