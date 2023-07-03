package com.example.dz13.controllerCalculator;


import com.example.dz13.CalculatorService.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/calculator")
    public class CalculatorController {

        private final CalculatorService calculatorService;

        public CalculatorController(CalculatorService calculatorService) {
            this.calculatorService = calculatorService;
        }
        @GetMapping()
        public String calculator(){
            return "Добро пожаловать в калькулятор!";
        }
        @GetMapping("/plus")
        public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b){
            int result= calculatorService.plus(a,b);
            return String.format("%s+%s=%s", a, b, result);
        }
        @GetMapping(path="/minus")
        public String minus(@RequestParam("num1") int a,@RequestParam("num2") int b){
            int result= calculatorService.minus(a,b);
            return String.format("%s-%s=%s", a, b, result);
        }
        @GetMapping(path="/multiply")
        public String multiply(@RequestParam("num1") int a,@RequestParam("num2") int b){
            int result= calculatorService.multiply(a,b);
            return String.format("%s*%s=%s", a, b, result);
        }
        @GetMapping(path="/divide")
        public String divide(@RequestParam("num1") int a,@RequestParam("num2") int b){
            try {
                int result = calculatorService.divide(a, b);
                return String.format("%s/%s=%s", a, b, result);
            } catch (Exception e){
                return "на ноль делить нельзя";
            }
        }


    }
