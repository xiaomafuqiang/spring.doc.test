package net.htmlonline.bean.property.editor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan(basePackageClasses = Config.class)
public class Config {
    /*
        <bean id="CustomEditorConfigurer" class="org.springframework.beans.factory.config.CustomEditorConfigurer">
          <property name="customEditors">
            <map>
              <entry key="com.demo.domain.Telephone" value="com.demo.mvc.component.TelephonePropertyEditor" />
            </map>
          </property>
        </bean>

    */

    @Bean
    public CustomEditorConfigurer customEditorConfigurer(){
        CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
        Map map = new HashMap();
        map.put(Telephone.class, TelephonePropertyEditor.class);
        customEditorConfigurer.setCustomEditors(map);
        return customEditorConfigurer;
    }

    @Bean
    public Telephone telephone2(@Value("0100-12345") Telephone telephone){
        return telephone;
    }
}
