package springboot101.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequeatMapping("/")
    public String index() {
        return "index";
    }
}