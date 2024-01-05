package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Four {
    public void Element(){
    HashSet<Integer> arr=new HashSet<>();
    Scanner Four = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Four.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Four.nextInt());
    }
    System.out.println("after clearing HashSet : ");
    arr.clear();
    System.out.println(arr);
    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.Element();
    }
}
