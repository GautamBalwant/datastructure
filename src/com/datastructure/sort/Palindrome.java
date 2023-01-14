package com.datastructure.sort;

public class Palindrome {

    private static boolean isPalindrome(String input){
        if("".equalsIgnoreCase(input)){
            return true;
        }
        int start= 0;
        int end= input.length()-1;

        while(start<end){
            if(input.charAt(start)!= input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }


        return true;
    }

    private static boolean isPalidromeRecursion(String input){
        if("".equalsIgnoreCase(input)){
            return true;
        }

        return palidrome(input,0 , input.length()-1);
    }

    private static boolean palidrome(String input, int start, int end){
        if(start>=end){
            return true;
        }

        if(input.charAt(start)== input.charAt(end)){
            return palidrome(input, start+1,end-1);
        }
        return false;
    }


    public static void main(String[] args){

        boolean result = isPalindrome("abba");
        System.out.println(result);

        boolean result2 = isPalidromeRecursion("abba");
        System.out.println(result2);

    }
}
