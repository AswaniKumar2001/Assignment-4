package TreeMap;

import java.util.TreeMap;
import java.util.Scanner;

public class Two {
    public void VehicleColour() {
        TreeMap<String, String> arr1 = new TreeMap<>();
        TreeMap<String, String> arr2 = new TreeMap<>();
        Scanner Two = new Scanner(System.in);
        System.out.println("Enter size of 1st TreeMap : ");
        int n = Two.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Two.next();
            String value = Two.next();
            arr1.put(key, value);
        }
        System.out.println("Enter size of 2nd TreeMap : ");
        int m = Two.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < m; i++) {
            String key = Two.next();
            String value = Two.next();
            arr2.put(key, value);
        }
        arr2.putAll(arr1);
        System.out.println("after copying all mapping values from Treemap1 to TreeMap2, updated TreeMap2 : " + arr2);
    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.VehicleColour();
    }
}
