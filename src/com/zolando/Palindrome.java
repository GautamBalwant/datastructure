package com.zolando;

import com.datastructure.sort.Brackets;

public class Palindrome {

    public static void main(String[] args){
        int input = 16461;
        System.out.println(isPalindrome(input));

    }

    static boolean isPalindrome(int n)
    {
        // Find the appropriate divisor
        // to extract the leading digit
        int divisor = 1;
        while (n / divisor >= 10)
            divisor *= 10;

        while (n != 0)
        {
            int leading = n / divisor;
            int trailing = n % 10;

            // If first and last digit
            // not same return false
            if (leading != trailing)
                return false;

            // Removing the leading and trailing
            // digit from number
            n = (n % divisor) / 10;

            // Reducing divisor by a factor
            // of 2 as 2 digits are dropped
            divisor = divisor / 100;
        }
        return true;
    }

    static boolean checkPalindorme(int k){
        int divisor =1;

        while(k/divisor >=10){
            divisor = divisor*10;
        }

        while(k!=0){
            int leading = k/divisor;
            int ending = k%10;

            if(leading != ending) {
                return false;
            }

            k = (k%divisor)/10;

            divisor= divisor/100;
        }
        return true;
    }
}
