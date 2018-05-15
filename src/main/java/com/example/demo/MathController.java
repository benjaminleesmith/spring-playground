package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/pi")
    public String pi() {
        return "3.141592653589793";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam(required = false, defaultValue = "add") String operation, @RequestParam int x, @RequestParam int y) {
        switch(operation) {
            case "multiply":
                return new Integer(x*y).toString();
            case "subtract":
                return new Integer(x-y).toString();
            case "divide":
                return new Integer(x/y).toString();
            default:
                return new Integer(x+y).toString();
        }
    }
}
