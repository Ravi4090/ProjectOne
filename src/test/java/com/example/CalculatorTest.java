package com.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.subtract(5, 2));
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.multiply(2, 5));
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
