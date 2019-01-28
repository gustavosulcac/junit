package pe.academy.junit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.academy.junit.util.Constantes;

@Controller
public class NextController {
	@RequestMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "You are in new page !!");
        return Constantes.NEXT;
    }
}
