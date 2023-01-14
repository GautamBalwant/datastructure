package com.function.example;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyDateExample {

    public static void main(String[] args){

        Supplier<MyDate> myDate = MyDate::new;
        MyDate date = myDate.get();

        Function<Date, String> datePrinter = date::getDayName;

        System.out.print(datePrinter.apply(new Date()));
    }
}
