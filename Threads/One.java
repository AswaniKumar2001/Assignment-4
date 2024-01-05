package Threads;

import java.io.*;

class Hello_World extends Thread {
    public void run() {
        System.out.println("hello World !! ");
    }
}

public class One {
    public static void main(String[] args) {
        Hello_World x = new Hello_World();
        x.start();
    }
}
