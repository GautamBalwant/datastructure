package com.datastructure.sort;

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int currentProfit=0;
        int currentValue=prices[0];

        for(int i=1;i<prices.length;i++){

            int profit = prices[i]-currentValue;

            if(profit>currentProfit){
                currentProfit=profit;
            }else{
                if(currentValue>prices[i]) {
                    currentValue = prices[i];
                }
            }

            if(maxProfit<currentProfit){
                maxProfit=currentProfit;
            }
        }

        return maxProfit;

    }

    public static void main(String args[]) {
        // int[] array= {3, 4, 5, 6, 9, 3, 1};

        int[] arr_1 =  {7,1,5,3,6,4};

        int[] arr_2 = {1, 5, 3, 3, 3};

        //int[]  array={ 8, 9 ,9 ,6, 5, 4, 2, 3};
        int result= maxProfit(arr_1);
        System.out.println(result);


    }
}
