package net.htmlonline.validation;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Customer {

//    Could not initialize class org.hibernate.validator.internal.engine.ConfigurationImpl

    @NotNull
    private Integer age;

    @Min(value = 10)
    private Integer num;

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                '}';
    }
}