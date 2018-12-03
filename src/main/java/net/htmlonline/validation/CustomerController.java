package net.htmlonline.validation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @RequestMapping("/")
    @ResponseBody
    public String home(@Valid Customer customer, BindingResult bindingResult){
        System.out.println(customer);
        return bindingResult.toString();
    }
}
