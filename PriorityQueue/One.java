package PriorityQueue;

import java.util.Scanner;
import java.util.PriorityQueue;

public class One {
    public void colour(){
        PriorityQueue<String> arr= new PriorityQueue<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter no of elements in PriorityQueue : ");
        int n = One.nextInt();
        System.out.println("Enter Colours : ");
        for(int i=0;i<n;i++){
            arr.add(One.next());
        }
        System.out.println(arr);
    }
    
   public static void main(String[] args) {
        One obj = new One();
        obj.colour();
   } 
}
