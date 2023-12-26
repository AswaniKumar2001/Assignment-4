package ArrayList;

import java.util.*;

public class Two {
    public void array(){
        ArrayList<String> arr= new ArrayList<>();
        Scanner Two = new Scanner(System.in);
        System.out.println("Enter no of elements in Array : ");
        int n = Two.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(Two.next());
        }
        System.out.println("iterating through the array and printing elements :");
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }  
    }
    
   public static void main(String[] args) {
        Two obj = new Two();
        obj.array();
   } 
    
}
