package com.example.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public class AppThread implements Runnable{



    public static void main(String[] args){
        Thread thread = new Thread(() -> {
            int i=0;
            while(i<10){
                System.out.println(i);
                i++;
            }
        });

        Executor e= new Executor() {
            @Override
            public void execute(Runnable command) {
                
            }
        };

        thread.start();
    }

    @Override
    public void run() {

    }
}
