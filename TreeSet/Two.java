package TreeSet;

import java.util.*;

public class Two {
    public void array(){
        TreeSet<String> arr= new TreeSet<>();
        Scanner Two = new Scanner(System.in);
        System.out.println("Enter no of elements in TreeSet : ");
        int n = Two.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(Two.next());
        }
        System.out.println("iterating through the TreeSet and printing elements :");
        Iterator<String> a=arr.iterator();
        while(a.hasNext()){
            System.out.println(a.next());
        } 
    }
    
   public static void main(String[] args) {
        Two obj = new Two();
        obj.array();
   } 
}
