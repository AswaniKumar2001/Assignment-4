package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Three {
    public void Element(){
    HashSet<Integer> arr=new HashSet<>();
    Scanner Three = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Three.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Three.nextInt());
    }
    System.out.println("no of elements in the HashSet : ");
    System.out.println(arr.size());
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.Element();
    }
}
