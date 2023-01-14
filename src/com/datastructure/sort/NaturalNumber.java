package com.datastructure.sort;

public class NaturalNumber {



    private static int sum(int input){
        if(input ==1){
            return input;
        }

        return sum(input-1)+input;
    }

    private static int sumUsingFormula(int input){

        return (input*(input+1))/2;
    }

    public static void main(String[] args){

        int result = sum(100);
        System.out.println(result);

        int result2= sumUsingFormula(100);
        System.out.println(result2);

    }
}
