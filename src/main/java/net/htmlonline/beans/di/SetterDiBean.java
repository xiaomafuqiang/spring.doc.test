package net.htmlonline.beans.di;

import net.htmlonline.beans.alphabet.BeanA;

import java.util.Arrays;

public class SetterDiBean {

    private BeanA beanA;
    private Integer age;
    private String name;

    private String[] myProperties;

    @Override
    public String toString() {
        return "SetterDiBean{" +
                "beanA=" + beanA +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", myProperties=" + Arrays.toString(myProperties) +
                '}';
    }


    public void setMyProperties(String[] myProperties) {
        this.myProperties = myProperties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBeanA(BeanA beanA) {
        this.beanA = beanA;
    }

}
