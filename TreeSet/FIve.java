package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class FIve {
    public void Element(){
        TreeSet<String> arr= new TreeSet<>();
        Scanner FIve = new Scanner(System.in);
        System.out.println("Enter no of elements in TreeSet : ");
        int n = FIve.nextInt();
        System.out.println("Enter Elements : ");
        for(int i=0;i<n;i++){
            arr.add(FIve.next());
        }
        System.out.println("First Element : "+arr.first());
        System.out.println("Last Element : "+arr.last());
    }
    
   public static void main(String[] args) {
        FIve obj = new FIve();
        obj.Element();
    }
}
