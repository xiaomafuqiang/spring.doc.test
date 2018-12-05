package net.htmlonline.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
    @RequestMapping("")
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
}
