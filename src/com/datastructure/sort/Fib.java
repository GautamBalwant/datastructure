package com.datastructure.sort;

import java.util.HashMap;
import java.util.Map;

public class Fib {

    private static int fib(int n,Map<Integer,Integer> memo){
        if(memo.get(n)!= null){
            return memo.get(n);
        }
        if(n<=1){
            return n;
        }

        int fib= fib(n-1,memo) + fib(n-2,memo);
        memo.put(n,fib);
        return fib;
    }


    public static void main(String[] args){
//        Map<Integer,Integer> memo= new HashMap<>();
//        int result = fib(7,memo);
//
//        System.out.println(result);



    }
}
