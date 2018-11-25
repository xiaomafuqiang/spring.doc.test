package net.htmlonline.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AnConfigurableAnnotation {

    @Bean
    public List<String> abcd(){
        ArrayList<String> integers = new ArrayList<>();
        integers.add("a");
        integers.add("b");
        integers.add("c");
        integers.add("d");
        return integers;
    }
}
