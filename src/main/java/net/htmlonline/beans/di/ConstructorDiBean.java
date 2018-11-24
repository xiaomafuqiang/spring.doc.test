package net.htmlonline.beans.di;

public class ConstructorDiBean {

    private Integer age;
    private String name;


    public ConstructorDiBean(Integer age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstructorDiBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
