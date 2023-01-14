package com.datastructure.sort;

import java.io.*;
import java.util.*;

public class PairSum {

    static int numberOfWays(int[] arr, int k) {
        // Write your code here

        List<Integer> uniqueElements = new ArrayList<Integer>();
        Map<Integer,Integer> hashMap= new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            if(!uniqueElements.contains(element)){
                uniqueElements.add(element);
            }
            Integer presentValue = hashMap.get(element);
            if(null == presentValue){
                hashMap.put(element,1);
            }else{
                hashMap.put(element, presentValue+1);
            }
        }

        int startIndex=0;
        int endIndex=uniqueElements.size()-1;
        int pair=0;

        while(startIndex<endIndex){
            int startValue= uniqueElements.get(startIndex);
            int endValue = uniqueElements.get(endIndex);

            int sum = startValue+endValue;
            if(sum<k){

                startIndex++;
            }else if(sum > k){
                endIndex--;
            }else {
                pair =pair+ hashMap.get(startValue)*hashMap.get(endValue);
                startIndex++;
            }
        }
        if(startIndex == endIndex){
            int startValue= uniqueElements.get(startIndex);
            int endValue = uniqueElements.get(endIndex);
            int sum= startValue+endValue;
            if(k==sum){
                int value= hashMap.get(startValue);
                pair= pair+ (value * (value-1)/2);
            }
        }

        return pair;

    }

    public static void main(String args[]) {
       // int[] array= {3, 4, 5, 6, 9, 3, 1};

        int[] arr_1 = {1, 2, 3, 4, 3};

        int[] arr_2 = {1, 5, 3, 3, 3};

        //int[]  array={ 8, 9 ,9 ,6, 5, 4, 2, 3};
       int result= numberOfWays(arr_2, 6);
       System.out.println(result);


    }
}
