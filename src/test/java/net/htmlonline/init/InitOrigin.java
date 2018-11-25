package net.htmlonline.init;

import net.htmlonline.beans.InitClassBean;
import net.htmlonline.util.BaseJunit4Test;
import net.htmlonline.util.MyScope;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

public class InitOrigin extends BaseJunit4Test {
    private ConfigurableApplicationContext context = getContext();


    @Test
    public void init(){
//        context.getBeanFactory().registerScope("myscope", new MyScope()); // test scope
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

}