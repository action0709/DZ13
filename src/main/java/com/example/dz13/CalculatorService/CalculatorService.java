package com.example.dz13.CalculatorService;

import com.example.dz13.exceptions.DivisionByZeroException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus (int a, int b){
        return a+b;
    }
    public int minus (int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide (int a, int b){
        if (b==0){
            throw new DivisionByZeroException();
        }
        return a / b;
    }
}
