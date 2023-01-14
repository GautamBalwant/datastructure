package com.zolando;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args){
       int[] input= {7,4,3,2,1,8,9};
       int k=2;
 System.out.println(smallestElement(input,k));
    }

    static int smallestElement(int[] input, int k){
        PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<input.length;i++){
            heap.add(input[i]);

            if(heap.size()>k){
                heap.poll();
            }
        }

        return heap.poll();

    }
}
