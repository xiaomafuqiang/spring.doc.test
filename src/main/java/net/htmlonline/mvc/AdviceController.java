package net.htmlonline.mvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

// 全局配置
@ControllerAdvice(basePackageClasses = AdviceController.class)
public class AdviceController {

    @ModelAttribute
    public void addAccount3(Model model, HttpServletRequest request) {
        request.setAttribute("foo", "foo value");
        model.addAttribute("account3", new Account(33));
    }

}

/*
*

// Target all Controllers annotated with @RestController
@ControllerAdvice(annotations = RestController.class)
public class AnnotationAdvice {}
// Target all Controllers within specific packages
@ControllerAdvice("org.example.controllers")
public class BasePackageAdvice {}
// Target all Controllers assignable to specific classes
@ControllerAdvice(assignableTypes = {ControllerInterface.class, AbstractController.cla
ss})
public class AssignableTypesAdvice {

* */
