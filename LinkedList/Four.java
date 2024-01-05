package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Four {
    public void Element(){
    LinkedList<Integer> arr=new LinkedList<>();
    Scanner Four = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Four.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Four.nextInt());
    }
    System.out.println("iterating through the LinkedList from last and printing elements: ");
    for(int i=x-1;i>=0;i--){
        System.out.println(arr.get(i));
    }
    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.Element();
    }
}
