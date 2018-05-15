package com.example.demo;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/math")
public class MathController {
    @GetMapping("/pi")
    public String pi() {
        return "3.141592653589793";
    }

    @GetMapping("/calculate")
    public String calculate(@RequestParam(required = false, defaultValue = "add") String operation, @RequestParam int x, @RequestParam int y) {
        return new Integer(MathService.calculate(operation, x, y)).toString();
    }

    @PostMapping("/sum")
    public String sum(@RequestParam MultiValueMap<String, String> numbers) {
        ArrayList<Integer> parsedNumbers = new ArrayList<>();
        for(String number : numbers.get("n")) {
            parsedNumbers.add(Integer.parseInt(number));
        }

        return MathService.sum(parsedNumbers).toString();
    }

    @RequestMapping("/volume/{length}/{width}/{height}")
    public String volume(@PathVariable int length, @PathVariable int width, @PathVariable int height) {
        return new Integer(length * width * height).toString();
    }
}
