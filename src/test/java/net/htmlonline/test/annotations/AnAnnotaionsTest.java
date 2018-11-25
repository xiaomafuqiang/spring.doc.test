package net.htmlonline.test.annotations;

import net.htmlonline.annotations.AnAnnotation;
import net.htmlonline.annotations.AnConfigurableAnnotation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnAnnotaionsTest {

    private AnnotationConfigApplicationContext getContext(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                AnConfigurableAnnotation.class, AnAnnotation.class);
        return context;
    }

    private AnnotationConfigApplicationContext getContextProgramed(){
        // 无参构造可以调用 register 否则重复两次refresh 异常
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AnConfigurableAnnotation.class);
        context.register(AnAnnotation.class);
        context.refresh(); // needed ## cannot have constructor with register programming..
        return context;
    }

    @Test
    public void run(){
        AnnotationConfigApplicationContext context = getContext();
//        System.out.println(context);
//        List<Integer> abc = context.getBean(List.class);
//        List<Integer> abc = context.getBean("abc", List.class);
//        System.out.println(abc);
        Object abcd = context.getBean("abcd");
        System.out.println(abcd.hashCode());
        abcd = context.getBean("abcd");
        System.out.println(abcd.hashCode());
    }
}
