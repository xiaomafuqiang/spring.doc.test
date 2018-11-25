package net.htmlonline.conditional;

import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalTest extends BaseJunit4Test {

    @Test
    public void run(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
//        ConfigurableApplicationContext context = getContext(); // using it first should add config to xml config

        Object aConditionBean = context.getBean("conditionBean");
        System.out.println(aConditionBean);
    }
}
