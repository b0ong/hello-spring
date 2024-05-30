package Hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

@GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "스프링!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name="name") String name, Model model) {
    model.addAttribute("name", name);
        return "hello-template";
    }
}
