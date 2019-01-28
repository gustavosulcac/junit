package pe.academy.junit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.academy.junit.util.Constantes;

@Controller
public class IndexController {

	@RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "HowToDoInJava Reader !!");
        return Constantes.INDEX;
    }
}
