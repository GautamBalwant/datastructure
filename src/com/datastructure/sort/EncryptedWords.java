package com.datastructure.sort;

public class EncryptedWords {

    static String findEncryptedWord(String s) {
        // Write your code here
        if(s.isEmpty() || s.length()==1){
            return s;
        }

        int mid = s.length()/2;
        if(s.length()%2==0){
            mid--;
        }

        return s.charAt(mid) + findEncryptedWord(s.substring(0, mid)) + findEncryptedWord(s.substring( mid+1,s.length()));

    }


    public static void main(String[] args){
       String result =  findEncryptedWord("abcd");
       System.out.println(result);
    }
}
