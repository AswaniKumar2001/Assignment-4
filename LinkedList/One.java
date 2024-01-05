package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class One {
    public void Element(){
    LinkedList<Integer> arr=new LinkedList<>();
    Scanner One = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=One.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(One.nextInt());
    }
    System.out.println("Enter the element that you want to add at Last : ");
    int y= One.nextInt();
    arr.addLast(y);
    System.out.println("updated LinkedList: ");
    System.out.println(arr);
    }

    public static void main(String[] args) {
        One obj = new One();
        obj.Element();
    }
}
