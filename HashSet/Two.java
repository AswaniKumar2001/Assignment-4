package HashSet;

import java.util.*;

public class Two {
    public void Element(){
    HashSet<Integer> arr=new HashSet<>();
    Scanner Two = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Two.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Two.nextInt());
    }
    System.out.println("iterating through the HashSet and printing elements: ");
    Iterator<Integer> a= arr.iterator();
    while(a.hasNext()){
        System.out.println(a.next());
    }
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.Element();
    }
}
