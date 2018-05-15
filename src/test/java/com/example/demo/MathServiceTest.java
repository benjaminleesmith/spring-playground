package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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
    public void testCalculateSubtractsTwoNumbers() throws Exception {
        int result = MathService.calculate("subtract", 4, 6);

        assertEquals(-2, result);
    }

    @Test
    public void testCalculateDividesTwoNubmers() throws Exception {
        int result = MathService.calculate("divide", 30, 5);

        assertEquals(6, result);
    }

    @Test
    public void testCalculateDefaultsToAddition() throws Exception {
        int result = MathService.calculate("", 3, 10);

        assertEquals(13, result);
    }
}