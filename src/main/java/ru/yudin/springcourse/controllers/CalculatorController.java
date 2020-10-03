package ru.yudin.springcourse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("calculator")
    public String calculator(@RequestParam("a") int a, @RequestParam("b") int b,
                             @RequestParam("operation") String operation,
                             Model model) {
        double result = 0;
        if (operation.equals("multiplication"))
            result = a * b;
        else if (operation.equals("division"))
            result = a / (double) b;
        else if (operation.equals("subtraction"))
            result = a - b;
        else if (operation.equals("addition"))
            result = a + b;

        model.addAttribute("result", result);

        return "first/calculator";

    }
}
