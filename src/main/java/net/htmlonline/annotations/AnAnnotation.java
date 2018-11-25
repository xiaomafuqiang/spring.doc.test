package net.htmlonline.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

// can configured without ->
//@Configuration
@Component
public class AnAnnotation {

    @Bean
    public List<String> abc(){
        System.out.println(getClass().getName());
        ArrayList<String> integers = new ArrayList<>();
        integers.add("a");
        integers.add("b");
        integers.add("c");
        return integers;
    }
}
