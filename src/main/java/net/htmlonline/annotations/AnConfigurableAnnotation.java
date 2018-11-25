package net.htmlonline.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ImportResource({"classpath:a.xml"}) // 导入 xml 配置 以javaConfig 为主
public class AnConfigurableAnnotation {

    @Bean
    @Scope("prototype")
    public OneBean abcd(){
        return new OneBean();
    }


    @Bean
    public String one(){
//        System.out.println(abcd().hashCode());
        return "one";
    }

    @Bean
    public String two(){
//        System.out.println(abcd().hashCode());
        return "two";
    }
}
