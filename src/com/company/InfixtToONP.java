package com.company;

import java.util.Stack;

/**
 * Created by RENT on 2017-06-01.
 */
public class InfixtToONP {
    private Stack<String> output = new Stack<>();
    private Stack<String> stack = new Stack<>();
    private String[] tempresult;
    private String result;
    public String getResult() {return result;}
    public InfixtToONP(String s){
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            try{
                int temp = Integer.parseInt(split[i]);
                output.push(split[i]);
            }catch (NumberFormatException e){
                char charTemp = split[i].charAt(0);
                switch (charTemp) {
                    case '(': {
                        stack.push(split[i]);
                        break;
                    }
                    case ')': {
                        while(stack.peek().charAt(0)!='('){
                            output.push(stack.pop());
                        } stack.pop();
                        break;
                    }
                    default:{
                        if(!stack.isEmpty()) {
                            char onStack = stack.peek().charAt(0);
                            while (!evaluateOperators(charTemp, onStack) && !stack.isEmpty()) {
                                output.push(stack.pop());
                                if(stack.isEmpty())
                                {break;}
                                else
                                    onStack = stack.peek().charAt(0);
                            }
                            stack.push(split[i]);
                        }else stack.push(split[i]);
                    }
                }


            }

        }while (!stack.isEmpty()){
            output.push(stack.pop());
        }
        tempresult = new String [output.size()];
        for (int i = output.size()-1; i >=0 ; i--) {
            tempresult[i] = output.pop();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tempresult.length; i++) {
            builder.append(tempresult[i]);
            builder.append(" ");
        }
            result = builder.toString();
        }

    private int assignValueToOperators(char op){
        int value = 0;
        switch (op) {
            case '(': value = 1;
            break;
            case '+': value = 2;
            break;
            case '-': value = 2;
            break;
            case '*': value = 3;
            break;
            case '/' : value = 3;
            break;
            case '^' : value = 4;
            break;
        }
        return value;
    }

    private boolean evaluateOperators(char op1, char op2){
       if(assignValueToOperators(op1)>assignValueToOperators(op2))
           return true;
       else {return false;}

    }

}
