package net.htmlonline.beans.di;

import net.htmlonline.beans.alphabet.BeanA;

public abstract class LookUpDiBean {

    public void processAny(){
        BeanA beanA = createBeanA();
        System.out.println(beanA);
    }

    public abstract BeanA createBeanA();

    @Override
    public String toString() {
        return getClass().getName();
    }
}
