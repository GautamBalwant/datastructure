package com.datastructure.sort;

public class CharRotation {

    // Add any helper functions you may need here

    static String numeric = "0123456789";
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    static String alphaCaps = "ABCDEFGJIJKLMNOPQRSTUVWXYZ";


    static String  rotationalCipher(String input, int rotationFactor) {
        // Write your code here
        char[] inputChars = input.toCharArray();
        for(int i=0;i<inputChars.length;i++){
            char charValue = inputChars[i];
            char afterRotation=  isAlphanumeric(charValue, rotationFactor);
            inputChars[i]=afterRotation;

        }


        return new String(inputChars);
    }

    static private char isAlphanumeric(char ch, int rotationFactor){

        if (ch >= '0' && ch <= '9'){
            return rotatedChar(ch,rotationFactor,numeric);
        }

        if(ch >= 'a' && ch <= 'z'){
            return rotatedChar(ch,rotationFactor,alpha);
        }

        if(ch >= 'A' && ch <= 'Z'){
            return rotatedChar(ch,rotationFactor,alphaCaps);
        }
   return ch;

    }

    static char rotatedChar(char chars, int rotationFactor,String alphaNumeric){
        if(alphaNumeric.indexOf(chars)==-1){
            return chars;
        }
        int index = alphaNumeric.indexOf(chars) + rotationFactor;
        return alphaNumeric.charAt(index % alphaNumeric.length());
    }

    public static void main(String[] args){
        String input_1 = "All-convoYs-9-be:Alert1.";
        int rotationFactor_1 = 4;
        System.out.println(rotationalCipher(input_1,rotationFactor_1));
    }
}
