package com.function.example;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args){

        Predicate<Integer> isGreaterThenZero = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer>0;
            }
        };

        Predicate<String> has50Char = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()<50;
            }
        };

        Predicate<String> isContainDownload = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("download");
            }
        };

        System.out.println(isGreaterThenZero.test(1));

     boolean test =   has50Char.negate().and(isContainDownload).test("download text download text download text download text download text");

     System.out.println(test);
    }
}
