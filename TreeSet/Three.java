package TreeSet;

import java.util.Scanner;
import java.util.TreeSet;

public class Three {
    public void Element() {
        TreeSet<String> arr1 = new TreeSet<>();
        TreeSet<String> arr2 = new TreeSet<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter no of elements in  1st TreeSet : ");
        int n = Three.nextInt();
        System.out.println("Enter Elements of 1st TreeSet: ");
        for (int i = 0; i < n; i++) {
            arr1.add(Three.next());
        }
        System.out.println("Enter no of elements in  2nd TreeSet : ");
        int m = Three.nextInt();
        System.out.println("Enter Elements of 2nd TreeSet: ");
        for (int i = 0; i < m; i++) {
            arr2.add(Three.next());
        }
        arr2.addAll(arr1);
        System.out.println("After adding elements from TreeSet1 to TreeSet2, Updated TreeSet 2: " + arr2);
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.Element();
    }
}
