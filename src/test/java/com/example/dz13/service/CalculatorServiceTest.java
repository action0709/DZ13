package com.example.dz13.service;

import com.example.dz13.CalculatorService.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    void plusPositive(){
        int actual = calculatorService.plus(3, 5);
        assertEquals(8, actual);

    }
    @Test
    void plusNegative(){
        int actual = calculatorService.plus(-3, -5);
        assertEquals(-8, actual);

    }
    @Test
    void minusPositive(){
        int actual = calculatorService.minus(10, 4);
        assertEquals(6, actual);

    }
    @Test
    void minusNegative(){
        int actual = calculatorService.minus(10, -5);
        assertEquals(15, actual);

    }
    @Test
    void multiplyPositive(){
        int actual = calculatorService.multiply(10, 4);
        assertEquals(40, actual);

    }
    @Test
    void multiplyNegative(){
        int actual = calculatorService.multiply(10, -5);
        assertEquals(-50, actual);

    }
    @Test
    void dividePositive(){
        int actual = calculatorService.divide(10, 5);
        assertEquals(2, actual);

    }
    @Test
    void divideNegative(){
        int actual = calculatorService.divide(20, -5);
        assertEquals(-4, actual);

    }
    @Test
    void divideByZero(){

        assertTrows(DivisionByZero.class,()->calculatorService.divide(10,0));

    }
}
