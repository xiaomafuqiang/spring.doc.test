package net.htmlonline.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Conditional({ConditionalControl.class})
public class ConditionalConfig {

    @Bean
    @Conditional({ConditionalControl.class})
    public ConditionalBean conditionBean(){
        ConditionalBean bean = new ConditionalBean();
        System.out.println(bean);
        return bean;
    }
}
