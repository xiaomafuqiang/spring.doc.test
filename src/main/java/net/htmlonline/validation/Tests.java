package net.htmlonline.validation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class Tests {

    private AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    @Test
    public void run() {
        Customer customer = new Customer();
        customer.setAge(222);

        DataBinder binder = new DataBinder(customer);

        binder.setValidator(new Validator() {
            @Override
            public boolean supports(Class<?> aClass) {
                return true;
            }

            @Override
            public void validate(Object o, Errors errors) {
                Customer o1 = (Customer) o;
                Integer age = o1.getAge();
                if (age == null) {
                    errors.reject("age 年龄。。。");
                }
                Integer num = o1.getNum();
                if (num == null) {
                    errors.reject("num null...");
                    return;
                }
                if ( num < 10) {
                    errors.reject("num小。。。");
                }
            }
        });

        binder.validate();
        BindingResult bindingResult = binder.getBindingResult();
        System.out.println(bindingResult);
    }
}
