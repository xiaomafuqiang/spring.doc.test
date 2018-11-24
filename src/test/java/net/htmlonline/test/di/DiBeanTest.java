package net.htmlonline.test.di;

import net.htmlonline.beans.di.ConstructorDiBean;
import net.htmlonline.beans.di.FactoryMethodDiBean;
import net.htmlonline.beans.di.SetterDiBean;
import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/*
*
    注解对比	@Resource	@Autowire
    注解来源	JDK	Spring
    装配方式	优先按名称	优先按类型
    属性	    name、type	required

* */


public class DiBeanTest extends BaseJunit4Test {

    @Autowired
    private FactoryMethodDiBean factoryMethodDiBean;

    // 默认按照类型 byType
    @Autowired
    private SetterDiBean setterDiBean;

    @Autowired
    // 开启 byName
    // 否则报错
    @Qualifier("setterDiBean22")
    private SetterDiBean setterDiBean2;


    @Resource(name = "setterDiBean22")
    private SetterDiBean setterDiBean3;

    @Autowired
    private ConstructorDiBean constructorDiBean;

    @Test
    public void run(){

        System.out.println(factoryMethodDiBean);

        System.out.println(setterDiBean);
        System.out.println(setterDiBean2);
        System.out.println(setterDiBean3);

        System.out.println(constructorDiBean);
    }
}
