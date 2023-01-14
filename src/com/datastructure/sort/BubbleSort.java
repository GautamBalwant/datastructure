package com.datastructure.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {




    public static void main(String[] args){
        Random random = new Random();
        int[] numbers = new int[10];
       // Arrays.fill(numbers, random.ints(10).toArray());
     //  numbers = random.ints(100, 0,10).toArray();
       for (int i=0;i<10;i++){
           System.out.print(" | " + i + " | ");
           System.out.println(numbers[1]);
       }

    }

}
