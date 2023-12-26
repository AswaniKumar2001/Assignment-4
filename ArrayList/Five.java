package ArrayList;

import java.util.*;

public class Five {
    public void array(){
        ArrayList<String> arr= new ArrayList<>();
        Scanner Five = new Scanner(System.in);
        System.out.println("Enter no of elements in Array : ");
        int n = Five.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(Five.next());
        }
        System.out.println("Enter the element that you want to remove : ");
        String x=Five.next();
        int m;
        m=arr.indexOf(x);
        System.out.println("enter the element that you want to replace : ");
        String y=Five.next();
        arr.set(m,y);
        System.out.println(arr);
    }
    
   public static void main(String[] args) {
        Five obj = new Five();
        obj.array();
   } 
}
