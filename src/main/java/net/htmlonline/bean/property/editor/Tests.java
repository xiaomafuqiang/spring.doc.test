package net.htmlonline.bean.property.editor;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Tests {

    @Test
    public void run() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // @Value("010-12345") Telephone telephone
        //  telephone 赋值 触发转换 TelephonePropertyEditor
        // 需要先配置 CustomEditorConfigurer
        Telephone telephone = context.getBean("telephone2", Telephone.class);
        System.out.println(telephone);

    }
}
