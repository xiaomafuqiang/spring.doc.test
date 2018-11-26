package net.htmlonline.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;
    private List<String> blackList;

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;

    }

    public void sendEmail(String address, String text){
//        if (blackList.contains(text)) {
            BlackListEvent event = new BlackListEvent((ApplicationContext) this, address, text);
            publisher.publishEvent(event);
//            return;
//        }

    }
}
