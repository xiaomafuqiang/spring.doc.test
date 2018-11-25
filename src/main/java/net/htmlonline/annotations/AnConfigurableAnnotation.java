package net.htmlonline.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
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
