package com.company;

/**
 * Created by RENT on 2017-05-29.
 */
public class Helper {
    private double result;
    private int firstVal;
    private int secondVal;
    private char operator;
    public Helper(char operator, int firstVal, int secondVal ){
        this.operator = operator;
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }
    public double getResult() {
        if (operator == '+') {
            Addition addition = new Addition(firstVal,secondVal);
            result = addition.getResult();
        }
        if(operator== '-'){
            Substraction substraction = new Substraction(firstVal, secondVal);
            result = substraction.getResult();

        }
        if(operator == '/'){
            Division division = new Division(firstVal, secondVal);
            result = division.getResult();
        }
        if(operator == '*'){
            Multiplication multiplication = new Multiplication(firstVal, secondVal);
            result = multiplication.getResult();
        }
        return result;
    }
}
