package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Four {
    public void Element(){
    PriorityQueue<Integer> arr=new PriorityQueue<>();
    Scanner Four = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Four.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Four.nextInt());
    }
    System.out.println("Enter Element to add: ");
    int y=Four.nextInt();
    arr.add(y);
    System.out.println("updated Priority Queue: ");
    System.out.println(arr);
    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.Element();
    }
}
