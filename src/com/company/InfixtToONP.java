package com.company;

import java.util.Stack;

/**
 * Created by RENT on 2017-06-01.
 */
public class InfixtToONP {
    private Stack<String> output = new Stack<>();
    private Stack<String> stack = new Stack<>();
    private String[] result;
    public InfixtToONP(String s){
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            try{
                int temp = Integer.parseInt(split[i]);
                output.push(split[i]);
            }catch (NumberFormatException e){
                char charTemp = split[i].charAt(0);
                if(!stack.isEmpty()) {
                    char onStack = stack.peek().charAt(0);
                    while (evaluateOperators(onStack, charTemp) && !stack.isEmpty()) {
                        output.push(stack.pop());
                        if(stack.isEmpty())
                        {break;}
                        else
                        onStack = stack.peek().charAt(0);
                    }
                    stack.push(split[i]);
                }else stack.push(split[i]);
            }

        }while (!stack.isEmpty()){
            output.push(stack.pop());
        }
        result = new String [output.size()];
        for (int i = output.size()-1; i >=0 ; i--) {
            result[i] = output.pop();
        }

        }
    public String[] getResult() {return result;}


    private boolean evaluateOperators(char op1, char op2){
        if((op1 =='/' || op1 == '*') && (op2 == '-' || op2 == '+')){
            return true;
        } else if((op1 == '+' || op1 =='-')&& (op2 == '*' || op2 == '/'))
            return false;
        else return false;
    }

}
