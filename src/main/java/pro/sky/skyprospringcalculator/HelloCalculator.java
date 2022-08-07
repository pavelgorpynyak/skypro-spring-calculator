package pro.sky.skyprospringcalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCalculator {

    public CalculatorServise calculatorServise;

    public HelloCalculator( CalculatorServise calculatorServise ) {
        this.calculatorServise = calculatorServise;
    }


    @GetMapping
    public String hello() {
        return calculatorServise.hello();
    }

    @GetMapping(path = "/calculator")
    public String welcomeMessage() {
        return calculatorServise.welcomeMessage();
    }


    @GetMapping(path = "/calculator/plus")
    public String calculatorPlus( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServise.plus(num1, num2);
        return num1 +"+" +num2 +"=" + sum;
    }

    @GetMapping(path = "/calculator/minus")
    public String calculatorMinus( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServise.minus(num1, num2);
        return num1 +"-" +num2 +"=" + sum;
    }

    @GetMapping(path = "/calculator/multiply")
    public String calculatorMultiply( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        int sum = calculatorServise.multiply(num1, num2);
        return num1 +"*" +num2 +"=" + sum;
    }

    @GetMapping(path = "/calculator/divide")
    public String calculatorDivide( @RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2 ) {
        double sum = calculatorServise.divide(num1, num2);
        return num1 +"/" +num2 +"=" + sum;
    }

}
