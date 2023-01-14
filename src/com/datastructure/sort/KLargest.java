package com.datastructure.sort;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargest {

    static void kthSmallestLargest(int arr[], int n, int k) {
        // Write your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());


        for(int i=0;i<n;i++){
            if(!minHeap.contains(arr[i])){
                minHeap.add(arr[i]);
            }

            if(!maxHeap.contains(arr[i])){
                maxHeap.add(arr[i]);
            }

            if(minHeap.size()>k){
                minHeap.remove();
            }

            if(maxHeap.size()>k){
                maxHeap.remove();
            }

        }


        int largestNumber = -1;
        if(minHeap.size()==k){
            largestNumber= minHeap.remove();
        }

        int smallestNumber = -1;

        if(maxHeap.size()==k){
            smallestNumber = maxHeap.remove();
        }
        System.out.print(largestNumber+" " + smallestNumber);

    }

    public static void main(String args[]) throws MalformedURLException {
       int[] array= {3, 4, 5, 6, 9, 3, 1};

      //int[]  array={ 8, 9 ,9 ,6, 5, 4, 2, 3};
      //  kthSmallestLargest(array, 7, 4);

        URL url = new URL("https://www.booking.com/city/us/denver.en-US.html?aid=318615;label=New_English");

        String path = url.getPath();
        String[] str = path.split("\\.");

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }




    }


}
