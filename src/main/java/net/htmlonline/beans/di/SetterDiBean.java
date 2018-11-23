package net.htmlonline.beans.di;

import net.htmlonline.beans.alphabet.BeanA;

public class SetterDiBean {

    private BeanA beanA;

    public BeanA getBeanA() {
        return beanA;
    }

    public void setBeanA(BeanA beanA) {
        System.out.println(beanA);
        this.beanA = beanA;
    }
}
