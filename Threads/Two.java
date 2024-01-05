package Threads;

import java.io.*;

public class Two {
    public static void main(String[] args) {
        //for Odd Numbers
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.println("Odd Number :"+i);
            }
        });
        //For Even Nuumbers
        Thread t2 = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even Number :"+i);
            }
        });

        t1.start();
        t2.start();
    }
}
