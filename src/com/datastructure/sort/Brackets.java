package com.datastructure.sort;

import java.util.ArrayList;
import java.util.List;

public class Brackets {

    List<Character> stack = new ArrayList<Character>();
    int top=-1;

    private char getOpenBracket(char bracket){
        if(bracket == '}') {
            return '{';
        }

        if(bracket == ')') {
            return '(';
        }

        return '[';
    }

   public boolean isBalanced(String s) {
        // Write your code here
        if(null == s || s.isEmpty()){
            return true;
        }

        for(int i=0; i<s.length();i++){
            char bracket = s.charAt(i);
            if( (bracket =='(') || (bracket =='{') || (bracket=='[')){
                stack.add(bracket);
                top++;
            }else {

                if(top ==-1) {
                    return false;
                }

                char openingBracket = getOpenBracket(bracket);
                char topElement = stack.get(top);

                if(topElement == openingBracket){
                    stack.remove(top);
                    top--;
                }
            }
        }

        return top==-1;



    }

    public static void main(String[] args){
        String s_2 = "{{[[(())]]}}";
        Brackets brackets = new Brackets();
       System.out.println( brackets.isBalanced(s_2));

    }

}
