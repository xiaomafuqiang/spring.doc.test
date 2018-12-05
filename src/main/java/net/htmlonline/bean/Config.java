package net.htmlonline.bean;

import net.htmlonline.bean.convert.StringDate;
import net.htmlonline.bean.property.editor.Telephone;
import net.htmlonline.bean.property.editor.TelephonePropertyEditor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;

import java.util.*;

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


    /*
        <!-- 日期转换工厂 -->
        <bean id="conversionService" class="org.springframework.context.support.ConversionServiceFactoryBean">
            <property name="converters">
                <list>
                    <bean class="com.converter.StringDate">
                        <constructor-arg type="java.lang.String" value="yyyy-MM-dd"></constructor-arg>
                    </bean>
                </list>
            </property>
        </bean>
    */
    @Bean
    public ConversionServiceFactoryBean conversionService(){
        ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
        Set set = new HashSet<>();
        set.add(new StringDate("yyyy-MM-dd"));
        bean.setConverters(set);

        return bean;
    }

}
