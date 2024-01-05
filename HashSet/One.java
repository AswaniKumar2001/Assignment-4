package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class One {
    public void Element(){
    HashSet<Integer> arr=new HashSet<>();
    Scanner One = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=One.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0;i<x;i++){
        arr.add(One.nextInt());
    }
    System.out.println("Enter the element that you want to add : ");
    int y= One.nextInt();
    arr.add(y);
    System.out.println("updated HashSet: ");
    System.out.println(arr);
    }

    public static void main(String[] args) {
        One obj = new One();
        obj.Element();
    }
}
