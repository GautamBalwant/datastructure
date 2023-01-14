package com.function.example;

import java.util.function.Function;

public class FunctionInterfaceExample {

    Function<String,Integer> findWord = new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return s.split(" ").length;
        }
    };

    Function<Integer,String> numberToText = new Function<Integer, String>() {
        @Override
        public String apply(Integer integer) {

            switch (integer){
                case 0: return "zero";
                case 1: return "one";
                case 2: return "two";
                case 3: return "Three";
                default: return "unknown";
            }

        }
    };

    Function<String , Integer> wordCountFunction = new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return s.split(" ").length;
        }
    };

    public static void main(String[] args){
        Integer count = new FunctionInterfaceExample().findWord.apply("gautam balwant singh");

        System.out.println(count);

        String number = new FunctionInterfaceExample().numberToText.apply(12);
        System.out.println(number);
        FunctionInterfaceExample example =   new FunctionInterfaceExample();

    String result=    example.findWord.andThen(example.numberToText).apply("gautam balwant singh");

        System.out.println(example.findWord.compose(example.numberToText).apply(3));

    System.out.print(result);
    }
}

