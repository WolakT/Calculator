package com.company;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by RENT on 2017-06-01.
 */
public class ONP {
    private ArrayList<String> listStack = new ArrayList<>();
    private Stack<String> stack = new Stack<>();
    private int result;
    public ONP(String s){
        int temp = 0;
        char charTemp = 'c';
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            try{
                temp = Integer.parseInt(split[i]);
                stack.push(split[i]);
            }catch (NumberFormatException e){
                charTemp = split[i].charAt(0);
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                Helper helper = new Helper(charTemp, b,a);
                stack.push(String.valueOf((int)(helper.getResult())));
            }


        }
        this.result = Integer.parseInt(stack.pop());


    }
    public int getResult(){return result;}

}
