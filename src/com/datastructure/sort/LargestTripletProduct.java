package com.datastructure.sort;

import java.util.*;

public class LargestTripletProduct {

    static int[] findMaxProduct(int[] arr) {
        // Write your code here

        int[] result = new int[arr.length];
        Queue<Integer> queue= new PriorityQueue<Integer>(3, Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            queue.add(arr[i]);
            if(i<2){
                result[i]=-1;
            }else{

                int product=1;
                for(Integer element : queue){
                    product = product * element;
                }
                result[i]=product;
            }
        }


        return result;

    }


    public static void main(String args[]) {
        // int[] array= {3, 4, 5, 6, 9, 3, 1};

       // int[] arr_1 = {1, 2, 3, 4, 3};

        int[] arr_1 = {1, 2, 3, 4, 5};

        //int[]  array={ 8, 9 ,9 ,6, 5, 4, 2, 3};
        int[] result= findMaxProduct(arr_1);
        System.out.println(result);


    }
}
