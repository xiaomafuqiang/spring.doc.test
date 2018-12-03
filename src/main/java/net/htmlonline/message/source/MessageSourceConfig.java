package net.htmlonline.message.source;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public ResourceBundleMessageSource messageSource(){
//        <value>format</value>
//        <value>exceptions</value>
//        <value>windows</value>
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("message/format", "message/exceptions", "message/window");
        return messageSource;
    }
}
