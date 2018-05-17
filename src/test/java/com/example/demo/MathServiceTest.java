package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MathServiceTest {
    @Test
    public void testSumReturnsTheSumOfAListOfNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));

        int result = MathService.sum(numbers);

        assertEquals(6, result);
    }

    @Test
    public void testCalculateMultiplesTwoNumbers() {
        int result = MathService.calculate("multiply", 4, 6);

        assertEquals(24, result);
    }

    @Test
    public void testCalculateSubtractsTwoNumbers() {
        int result = MathService.calculate("subtract", 4, 6);

        assertEquals(-2, result);
    }

    @Test
    public void testCalculateDividesTwoNubmers() {
        int result = MathService.calculate("divide", 30, 5);

        assertEquals(6, result);
    }

    @Test
    public void testCalculateDefaultsToAddition() {
        int result = MathService.calculate("", 3, 10);

        assertEquals(13, result);
    }

    @Test
    public void testAreaCalculatesTheAreaOfACircle() {
        double result = MathService.area( 4);

        assertEquals(50.26548245743669, result, 0.00001);
    }

    @Test
    public void testAreaCalculatesTheAreaOfARectangle() {
        double result = MathService.area(7, 4);

        assertEquals(28, result, 0.00001);
    }
}