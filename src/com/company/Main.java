package com.company;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InfixtToONP infix = new InfixtToONP("7 + 2 * 4 - 4");
        ONP onp3 = new ONP("7 2 4 * 4 - +");
        System.out.println(onp3.getResult());
        System.out.println("Should be : 11");

        InfixtToONP infix2 = new InfixtToONP("2 / 2 + 3 * 5");
        String[] newONP = infix2.getResult;
        ONP onp4 = new ONP("2 2 / 3 5 * +");
        System.out.println(onp4.getResult());
        System.out.println("shoould be : 16");

//        ONP onp = new ONP("12 1 2 3 * 4 5 / + * +");
//        ONP onp2 = new ONP ("12 2 3 4 * 10 5 / + * +");
//        System.out.println((double)4/5);
//        System.out.println(onp2.getResult());
//        System.out.println(onp.getResult());
//        int result =0;
//        int y = 0;
//        int x = 0;
//        int firstVal = 0;
//        int secondVal = 0;
//        char charOperator = 'd';
//        String operator = new String();
//        int counter = 0;
//        File file = new File("C:\\Users\\RENT\\Desktop\\input.txt");
//
//        try (Scanner sc = new Scanner(file)){
//           while (sc.hasNext()){
//              // System.out.println(sc.next());
//               String line = new String(sc.next());
//               String[] list = new String[line.length()];
//                list = line.split(";");
//               for (int i = 0; i < list.length; i++) {
//                   //System.out.println("znak numer "+ i + " " + list[i]);
//                   firstVal = Integer.parseInt(list[0]);
//                   secondVal = Integer.parseInt(list[2]);
//                   charOperator = list[1].charAt(0);
//               }
//                   //System.out.println(charOperator);
//                   Helper helper = new Helper(charOperator, firstVal, secondVal);
//
//                   System.out.println(helper.getResult());
//               try {
//                   FileWriter resultWrite = new FileWriter("abc.txt");
//                   BufferedWriter bw = new BufferedWriter(resultWrite);
//                   bw.append('x');
//                   bw.flush();
//
//               } catch (IOException e) {
//                   e.printStackTrace();
//               }
//
//           }
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }









//        System.out.println("abc\r\ndef");
//            try {
//            x = sc.nextInt();
//            operator = sc.next();
//            y = sc.nextInt();}
//            catch (InputMismatchException e){
//
//            }
//            char charOperator = operator.charAt(0);
//            if (charOperator == '+') {
//                result = x + y;
//            } else if (charOperator == '/')
//                result = x / y;
//            else if (charOperator == '*')
//                result = x * y;
//            else if (charOperator == '-')
//                result = x - y;
//            else {
//                throw new IndexOutOfBoundsException("wrong operator");
//            }
//            System.out.println(result);
//        do {
//            operator = sc.next();
//            charOperator = operator.charAt(0);
//            y = sc.nextInt();
//            Helper helper = new Helper(charOperator, result, y);
//            System.out.println(helper.getResult());
//        } while(true);
        }
}
