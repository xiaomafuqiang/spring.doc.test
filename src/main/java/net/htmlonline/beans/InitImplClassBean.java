package net.htmlonline.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class InitImplClassBean implements InitializingBean, DisposableBean,
        ApplicationContextAware, BeanNameAware, BeanPostProcessor, BeanFactoryPostProcessor, FactoryBean<InitImplClassBean> {

    private String aField = "a field";

    @Override
    public String toString() {

        return getClass().getName();
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    // test life cycle implementation mode
    // no use vs init-method or after postConstruct
    // no use vs destroy-method or after preDestroy
    @Override
    public void afterPropertiesSet() throws Exception {
        try {
            throw new Exception("999");
        } catch (Exception e) {
            if (1 > 0) {
                return;
            }
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element :
                    stackTrace) {
                int lineNumber = element.getLineNumber();
                String fileName = element.getFileName();
                String methodName = element.getMethodName();

                String result = "fileName: " + fileName + "," +
                        "methodName: " + methodName + "," +
                        "lineNumber: " + lineNumber + "\n;";
                System.out.println(result);

            }
        }
    }

    @Override
    public void destroy() throws Exception {
//        System.out.println("destroy");
    }

    public void destroyMethod (){
//        System.out.println("my destroy");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        System.out.println(applicationContext + " +0-00-0-0-0-0-0");
    }

    @Override
    public void setBeanName(String s) {
//        System.out.println("bean name Aware.." + s);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // System.out.println(configurableListableBeanFactory);
    }



    // test

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public InitImplClassBean getObject() throws Exception {
        return null;
    }
}
