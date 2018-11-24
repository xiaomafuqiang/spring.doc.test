package net.htmlonline.test.di;

import net.htmlonline.beans.di.ConstructorDiBean;
import net.htmlonline.beans.di.FactoryMethodDiBean;
import net.htmlonline.beans.di.SetterDiBean;
import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DiBeanTest extends BaseJunit4Test {

    @Autowired
    private FactoryMethodDiBean factoryMethodDiBean;

    @Autowired
    private SetterDiBean setterDiBean;

    @Autowired
    private ConstructorDiBean constructorDiBean;

    @Test
    public void run(){

        System.out.println(factoryMethodDiBean);

        System.out.println(setterDiBean);

        System.out.println(constructorDiBean);
    }
}
