package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Two {
    public void Element(){
    LinkedList<Integer> arr=new LinkedList<>();
    Scanner Two = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Two.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Two.nextInt());
    }
    System.out.println("iterating through the LinkedList and printing elements: ");
    for(int i=0; i<x;i++){
        System.out.println(arr.get(i));
    }
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.Element();
    }
}
