package net.htmlonline.tryout;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class Play {
    Properties properties = new Properties();

    @Test
    public void run() throws IOException {
//        InputStream inputStream = new FileInputStream(new File("target/classes/properties/di.properties"));
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("properties/di.properties");

        properties.load(inputStream);
        String property = properties.getProperty("a.b");
        System.out.println(property);

    }
}
