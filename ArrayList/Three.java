package ArrayList;

import java.util.*;

public class Three {
    public void array(){
        ArrayList<String> arr= new ArrayList<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter no of elements in Array : ");
        int n = Three.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(Three.next());
        }
        System.out.println("Enter element that you want to add at first position :");
        String a=Three.next();
        arr.add(0,a);
        System.out.println("Updated array :");
        System.out.println(arr);
    }
    
   public static void main(String[] args) {
        Three obj = new Three();
        obj.array();
   } 
}
