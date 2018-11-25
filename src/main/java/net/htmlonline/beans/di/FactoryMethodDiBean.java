package net.htmlonline.beans.di;

public class FactoryMethodDiBean {
    private Integer age;
    private String name;

    private FactoryMethodDiBean(Integer age, String name) {
//        System.out.println("init constructor> " + getClass().getName());
        this.age = age;
        this.name = name;

    }

    // whatever return class beanName is bean tag def
//    public static ConstructorDiBean createInstance(Integer age, String name){
//        return new ConstructorDiBean(age, name);
//    }
    // whatever return class beanName is bean tag def
    public static FactoryMethodDiBean createInstance(Integer age, String name) {
        return new FactoryMethodDiBean(age, name);
    }

    @Override
    public String toString() {
        return "FactoryMethodDiBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
