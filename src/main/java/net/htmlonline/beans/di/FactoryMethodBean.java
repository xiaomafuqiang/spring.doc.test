package net.htmlonline.beans.di;

public class FactoryMethodBean {



    public static FactoryMethodBean createInstance(Integer age, String name){
        System.out.println(age + " :::::: " + name);
        return new FactoryMethodBean();
    }
}
