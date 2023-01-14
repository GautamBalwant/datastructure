package com.datastructure.sort;

import java.util.HashMap;
import java.util.Map;

public class TravelGrid {

    private static int grid(int row, int column , Map<String,Integer> memo){
        String key = row+"-"+column;
        Integer present = memo.get(key);
        if(null != present){
            return present;
        }
        if(row==1 && column ==1){
            return 1;
        }

        if(row==0 || column==0){
            return 0;
        }

        int result= grid(row-1,column,memo) + grid(row,column-1,memo);
        memo.put(key,result);
        return result;
    }

    public static void main(String[] args){
        Map<String,Integer> memo= new HashMap<>();
        int result = grid(0,6,memo);

        System.out.println(result);
    }
}
