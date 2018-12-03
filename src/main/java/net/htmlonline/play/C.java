package net.htmlonline.play;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class C {
    @Test
    public void run() throws IOException {
        System.out.println(getClass().getPackage());
        ClassPathResource classPathResource = new ClassPathResource("properties/a.properties");
        System.out.println(classPathResource);
        Properties properties = PropertiesLoaderUtils.loadProperties(classPathResource);
        System.out.println(properties);
    }
}
