package net.htmlonline;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class C {
    private ApplicationContext context = new ClassPathXmlApplicationContext();

    C(){
        String applicationName = context.getApplicationName();
        System.out.println("applicationName::::: " + applicationName);
        ApplicationContext parent = context.getParent();
        System.out.println("parent::::: " + parent);
        String id = context.getId();
        System.out.println("id " + id);
        String displayName = context.getDisplayName();
        System.out.println("displayName:::: " + displayName);
    }

    public static void main(String[] args) {
        new C();
    }

}