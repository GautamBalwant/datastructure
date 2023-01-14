package com.datastructure.sort;

public class ReverseString {

    private static String reversStringRecursion(String input){
        if("".equalsIgnoreCase(input)){
            return "";
        }


        return reversStringRecursion(input.substring(1)) + input.substring(0,1);
    }

    private static String reverseString(String input){
        char[] chars= input.toCharArray();
        int start=0;
        int end= input.length()-1;

        while(start <end){
            char temp = chars[start];
            chars[start]= chars[end];
            chars[end]= temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }

    public static void main(String args[]) {
        // int[] array= {3, 4, 5, 6, 9, 3, 1};

      String result=  reversStringRecursion("palak");

        System.out.println(result);

        String back = reverseString(result);
        System.out.println(back);


    }
}
