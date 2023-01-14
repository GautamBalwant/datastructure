package com.datastructure.sort;

public class ContinousSubArraySum {

    private static int sum(int[] arr){

        int maxSum= 0;
        int currentSum= 0;

        for(int i=0;i<arr.length;i++){
            int sum= currentSum *arr[i];

            if(arr[i]> sum){
                currentSum= arr[i];
            }else {
                currentSum= sum;
            }

            if(currentSum>maxSum){
                maxSum= currentSum;
            }

        }

        return maxSum;

    }


    public static void main(String args[]) {
        // int[] array= {3, 4, 5, 6, 9, 3, 1};

       int ans = solution("abbabba");
       System.out.println(ans);


    }

    public static int solution(String S) {
        // write your code in Java SE 8
        int len = S.length();

        if(len<2){
            return 0;
        }

        int result =0;
        int counter =1;

        while(counter <len){
            if(S.charAt(counter) == S.charAt(result)){
                ++result;
                ++counter;
            } else {
                counter= counter- result +1;
                result=0;
            }

        }

        return result;


    }
}
