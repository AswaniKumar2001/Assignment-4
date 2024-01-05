package TreeMap;

import java.util.TreeMap;
import java.util.Scanner;

public class Four {
    public void VehicleColour() {
        TreeMap<String, String> arr = new TreeMap<>();
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter size of TreeMap : ");
        int n = Four.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Four.next();
            String value = Four.next();
            arr.put(key, value);
        }
        System.out.println("enter the value, you want to search : ");
        String a = Four.next();
        if (arr.containsValue(a)) {
            System.out.println("yes the value is present");
        } else {
            System.out.println("value not present");
        }

    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.VehicleColour();
    }
}
