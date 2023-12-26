package ArrayList;

import java.util.*;

public class Four {
    public void array(){
        ArrayList<String> arr= new ArrayList<>();
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter no of elements in Array : ");
        int n = Four.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(Four.next());
        }
        System.out.println("enter Index to retrive element : ");
        int m=Four.nextInt();
        System.out.println("element retrived from array : ");
        System.out.println(arr.get(m));
    }
    
   public static void main(String[] args) {
        Four obj = new Four();
        obj.array();
   }
}
