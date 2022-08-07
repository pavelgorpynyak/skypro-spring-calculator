package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServise implements CalculatorServiseServ {

    public String hello() {
        return "<b>Welcome!</b>";
    }

    public String welcomeMessage() {
        return "<b>Welcome to calculator!</b>";
    }
    public int plus( Integer num1, Integer num2 ) {
        return num1 + num2;
    }

    public int minus( Integer num1, Integer num2 ) {
        return num1 - num2;
    }
    public int multiply( Integer num1, Integer num2 ) {
        return num1 * num2;
    }

    public double divide( Integer num1, Integer num2 ) {
        return num1 / num2;
    }

}
