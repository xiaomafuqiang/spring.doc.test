package net.htmlonline.conditional;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalTest {

    @Test
    public void run(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        Object aConditionBean = context.getBean("conditionBean");
        System.out.println(aConditionBean);
    }
}
