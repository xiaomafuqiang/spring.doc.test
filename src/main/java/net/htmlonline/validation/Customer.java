package net.htmlonline.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Customer {

//    Could not initialize class org.hibernate.validator.internal.engine.ConfigurationImpl

    @NotNull
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        System.out.println(age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}