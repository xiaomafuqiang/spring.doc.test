package net.htmlonline.message.source;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class TestMessageSource {
    @Test
    public void run(){
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MessageSourceConfig.class);
        ResourceBundleMessageSource messageSource = configApplicationContext.getBean("messageSource", ResourceBundleMessageSource.class);
        String message = messageSource.getMessage("argument.required", null, "Default", null);
        System.out.println(message);
    }
}
