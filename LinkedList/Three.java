package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Three {
    public void Element(){
    LinkedList<Integer> arr=new LinkedList<>();
    Scanner Three = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Three.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Three.nextInt());
    }
    System.out.println("Enter the specified position: ");
    int y = Three.nextInt();
    System.out.println("iterating through the LinkedList from specified position and printing elements: ");
    for(int i=y; i<x;i++){
        System.out.println(arr.get(i));
    }
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.Element();
    }
}
