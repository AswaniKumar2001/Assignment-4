package TreeMap;

import java.util.TreeMap;
import java.util.Scanner;

public class Three {
    public void VehicleColour() {
        TreeMap<String, String> arr = new TreeMap<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter size of TreeMap : ");
        int n = Three.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Three.next();
            String value = Three.next();
            arr.put(key, value);
        }
        System.out.println("enter the key, you want to search : ");
        String a = Three.next();
        if (arr.containsKey(a)) {
            System.out.println("yes the key is present and value associated to given key is: " + arr.get(a));
        } else {
            System.out.println("key not present");
        }

    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.VehicleColour();
    }
}
