package net.htmlonline.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class InitClassBeanT {
    private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    private InitClassBeanT(){
        String applicationName = context.getApplicationName();
        System.out.println("applicationName::::: " + applicationName);
        ApplicationContext parent = context.getParent();
        System.out.println("parent::::: " + parent);
        String id = context.getId();
        System.out.println("id " + id);
        String displayName = context.getDisplayName();
        System.out.println("displayName:::: " + displayName);


//        InitClassBean initClassBean = context.getBean(InitClassBean.class);
//        InitClassBean initClassBean = context.getBean("net.htmlonline.beans.InitClassBean#0", InitClassBean.class);
        InitClassBean initClassBean = context.getBean("initClassBean2", InitClassBean.class);
        System.out.println(initClassBean);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        String[] initClassBeans = context.getAliases("initClassBean");
        System.out.println(Arrays.toString(initClassBeans) + " ::::::");

    }

    public static void main(String[] args) {
        new InitClassBeanT();
    }

}