package TreeSet;

import java.util.TreeSet;
import java.util.Scanner;

public class One {
    public void colour(){
        TreeSet<String> arr= new TreeSet<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter no of elements in TreeSet : ");
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
