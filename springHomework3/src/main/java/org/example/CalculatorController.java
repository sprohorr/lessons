package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @GetMapping("/test")
    public String countUp(Calculator calculator, ModelMap modelMap) {
        modelMap.addAttribute("calculator", calculator);
        calculatorService.validCalculator(calculator);
        return "calculator";
    }

    @PostMapping("/test")
    public String getCount(Calculator calculator) {
        calculatorService.calculator(calculator);
        return "calculator";
    }
}
