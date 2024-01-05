package TreeSet;

import java.util.*;
import java.io.*;


public class Four {
    public void Element(){
        TreeSet<Integer> arr= new TreeSet<>();
        TreeSet<Integer> revarr= new TreeSet<>();
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter no of elements in TreeSet: ");
        int x = Four.nextInt();
        System.out.println("Enter elements: ");
        for(int i=0;i<x;i++){
            arr.add(Four.nextInt());
        }
        System.out.println("TreeSet is: "+arr);
        System.out.println("reversed Treeset: "+arr.descendingSet());

    }

    public static void main(String[] args) {
        Four obj= new Four();
        obj.Element();
    }
    
}
