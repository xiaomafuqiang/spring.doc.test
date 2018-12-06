package net.htmlonline.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
public class HomeController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println(binder);

    }


    @RequestMapping("/")
    @ResponseBody
    public String home(HttpServletRequest request){

        String contextPath = request.getServletContext().getContextPath();
        System.out.println(contextPath);
        return "<a href='" + contextPath + "/spring-web/4234/we'>handle</a>";
    }

    @RequestMapping("/spring-web/{n:\\d+}/{s}")
    @ResponseBody
    public String handle(@PathVariable String n, @PathVariable String s) {
        System.out.println(n);
        System.out.println(s);
        return "{+ n: " + n + ", s: " + s + "}";
    }

    @RequestMapping(path = "/consumer/{ss}", consumes = "!text/plain")
    @ResponseBody
    public String consumer() {
        String s = "1";
        String n = "1";
        System.out.println(n);
        System.out.println(s);
        return "{+ n: " + n + ", s: " + s + "}";
    }

    //添加一个属性
//该方法的返回值被添加到名为“account”的模型中
//您可以通过@ModelAttribute(“myAccount”)
    @ModelAttribute
    public Account addAccount() {
        return new Account(99);
    }

//    @ModelAttribute
//    public void addAccount3(Model model, HttpServletRequest request) {
//        request.setAttribute("foo", "foo value");
//        model.addAttribute("account3", new Account(33));
//    }

    @ModelAttribute("account2")
    public Account addAccount2() {
        return new Account(22);
    }


    @RequestMapping(path = "/model")
    @ResponseBody
    public String modelAttr(
            @Valid @ModelAttribute("account3") Account account,
            BindingResult result,
            Model model,
            @RequestAttribute("foo") String foo
            ) {
        System.out.println(account);
        System.out.println(model);
        System.out.println(result);
        System.out.println(foo);
        return "";
    }

    // json
    @GetMapping("/user")
//    @JsonView
    @ResponseBody
    public Account getUser() {
        return new Account(9);
    }



    // GET /pets/42;q=11;r=22
//    @RequestMapping("/pets/{petId}")
//    @ResponseBody
//    public String matrixVariable(@PathVariable String petId, @MatrixVariable(name="q", pathVar="petId") String q){
//
//        return "{'petId': " + petId + ", 'q': " + q + "}";
//    }
}
