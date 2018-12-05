package net.htmlonline.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
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

    // GET /pets/42;q=11;r=22
//    @RequestMapping("/pets/{petId}")
//    @ResponseBody
//    public String matrixVariable(@PathVariable String petId, @MatrixVariable(name="q", pathVar="petId") String q){
//
//        return "{'petId': " + petId + ", 'q': " + q + "}";
//    }
}
