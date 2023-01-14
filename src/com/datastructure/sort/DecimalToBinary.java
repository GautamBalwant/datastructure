package com.datastructure.sort;

public class DecimalToBinary {


    private static String decimalToBinary(int input){

        if(input==0){
            return "";
        }

        int reminder = input/2;
        int binary = input%2;


        return decimalToBinary(reminder) + binary;
    }

    private static String convert(int input){
        if(input==0){
            return "0";
        }
        return decimalToBinary(input);
    }

    private static String convertToBinary(int input){
        if(input==0){
            return "0";
        }

        String result="";

        while(input>0){
            int reminder = input/2;
            int binary = input%2;
            input= reminder;
            result = binary+result ;
        }
        return result;
    }


    public static void main(String[] args){

        String result = convert(223);
        System.out.println(result);

        String result2= convertToBinary(223);
        System.out.println(result2);

    }
}
