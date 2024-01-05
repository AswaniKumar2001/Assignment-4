package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Five {
    public void Element(){
    LinkedList<Integer> arr=new LinkedList<>();
    Scanner Five = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Five.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Five.nextInt());
    }
    System.out.println("Enter the element to add : ");
    int y=Five.nextInt();
    System.out.println("Enter the position : ");
    int z=Five.nextInt();
    arr.add(z-1,y);
    System.out.println("updated array : ");
    System.out.println(arr);
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.Element();
    }
}
