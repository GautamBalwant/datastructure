package com.function.example;

import java.util.function.Function;

public class OptionalExample {

    public static void main(String[] args){
        Function<String, String> getSecondWord = (String s) -> {
            return s.split(" ").length>1 ? s.split(" ")[1]: null;
        };

        Function<String, Integer> getLength =  ( t) -> {return t.length();};
    }
}
