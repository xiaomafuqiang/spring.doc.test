package net.htmlonline.util;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public abstract class BaseJunit4Test {

    public static ConfigurableApplicationContext getContext(){
        
        return new ClassPathXmlApplicationContext("spring.xml");
    }
    
    public static ConfigurableApplicationContext getContext(String... configXml){

        return new ClassPathXmlApplicationContext(configXml);
    }
}