package com.example.demo;

import javax.naming.NamingException;
import java.util.ArrayList;

public class MathService {
    public static Integer sum(ArrayList<Integer> numbers) {
        int total = 0;
        for(int number : numbers) {
            total = total + number;
        }

        return total;
    }

    public static int calculate(String operation, int x, int y) {
        switch (operation) {
            case "multiply":
                return x * y;
            case "subtract":
                return x - y;
            case "divide":
                return x / y;
            default:
                return x + y;
        }
    }

    public static double area(double radius) {
        return Math.PI * (Math.pow(radius, 2));
    }

    public static double area(double height, double width) {
        return height * width;
    }
}
