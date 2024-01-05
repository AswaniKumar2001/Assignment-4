package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Five {
    public void Element(){
    HashSet<Integer> arr=new HashSet<>();
    Scanner Five = new Scanner(System.in);
    System.out.println("Enter no of elements : ");
    int x=Five.nextInt();
    System.out.println("Enter elements: ");
    for(int i=0; i<x;i++){
        arr.add(Five.nextInt());
    }
    if(arr.isEmpty()){
        System.out.println("HashSet is Empty.");
    }
    else{
        System.out.println("HashSet is Not-Empty.");
    }
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.Element();
    }
}
