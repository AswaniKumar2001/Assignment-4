package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Five {
    public void Element(){
    PriorityQueue<Integer> arr=new PriorityQueue<>();
    Scanner Five = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Five.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Five.nextInt());
    }
    System.out.println("after clearing PriorityQueue : ");
    
    arr.clear();
    System.out.println(arr);
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.Element();
    }
}
