package com.datastructure.sort;

import java.util.HashMap;

public class CanSum {


    private static boolean canSum(int target, int[] numbers, HashMap<Integer,Boolean> memo){
       if(memo.get(target) != null){
           return memo.get(target);
       }
        if(target==0){
            return true;
        }
        if(target<0){
            return false;
        }

        for(int i=0;i<numbers.length;i++){
            int remender= target-numbers[i];
            boolean result = canSum(remender,numbers,memo);
            memo.put(remender,result);
            if(result){
                return true;
            }
        }

        memo.put(target,false);
        return false;
    }

    public static void main(String[] args){

//        System.out.println(canSum(7,new int[] {2,3},new HashMap<Integer,Boolean>()));
//        System.out.println(canSum(7,new int[] {5,3,7,4},new HashMap<Integer,Boolean>()));
//        System.out.println(canSum(7,new int[] {2,4},new HashMap<Integer,Boolean>()));
//        System.out.println(canSum(8,new int[] {2,3,5},new HashMap<Integer,Boolean>()));
//        System.out.println(canSum(300,new int[] {7,14},new HashMap<Integer,Boolean>()));

        //recurs(10);

       float f1= -343;
       float f2=0x12345;





    }



    private static void   recurs(int count){
        if(count ==0)
            return ;
        else {
            System.out.print(count + "");
            int recount = count-2;
            recurs(recount);
            return;
        }

    }
}
