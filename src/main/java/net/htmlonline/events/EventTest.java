package net.htmlonline.events;

import net.htmlonline.conditional.ConditionalConfig;
import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest extends BaseJunit4Test {

    @Test
    public void run(){
        ConfigurableApplicationContext context = getContext(); // using it first should add config to xml config
        EmailService emailService = context.getBean("emailService", EmailService.class);
        emailService.sendEmail("m@outlook.com", getClass().getName());

    }
}
