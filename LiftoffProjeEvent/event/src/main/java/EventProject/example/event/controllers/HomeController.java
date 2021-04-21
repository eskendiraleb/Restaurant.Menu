package EventProject.example.event.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping
    @ResponseBody
    public static String hello(){
        return "Hello There!";
    }
}
