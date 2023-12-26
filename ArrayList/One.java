package ArrayList;

import java.util.*;

public class One {
    public void colour(){
        ArrayList<String> arr= new ArrayList<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter no of elements in Array : ");
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