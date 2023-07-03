package com.example.dz13.service;

import com.example.dz13.CalculatorService.CalculatorService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class ParametrizedCalculatoreServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    static Stream<Arguments> dataForPlus(){
        return Stream.of(Arguments.of(3,5,8),
                Arguments.of(200,-20,180),
                Arguments.of(-100,50,-50)
        );
    }
    @ParameterizedTest
    @MethodSource("dataForPlus")
    void plus (int n1, int n2,int expected){
        assertEquals(expected, calculatorService.plus(n1,n2));
    }

    static Stream<Arguments> data(){
        return Stream.of(Arguments.of(3,5),
                Arguments.of(200,-20),
                Arguments.of(-100,50),
                Arguments.of(-200,50)
        );
    }
    @ParameterizedTest
    @MethodSource("data")
    void plus (int n1, int n2){
        int expected = n1 - n2;
        assertEquals(expected, calculatorService.minus(n1,n2));
    }
}
