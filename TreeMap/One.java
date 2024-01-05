package TreeMap;

import java.util.TreeMap;
import java.util.Scanner;

public class One {
    public void VehicleColour() {
        TreeMap<String, String> arr = new TreeMap<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter size of TreeMap : ");
        int n = One.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = One.next();
            String value = One.next();
            arr.put(key, value);
        }
        System.out.println("after key associated with value, TreeMap is : ");
        System.out.println(arr);

    }

    public static void main(String[] args) {
        One obj = new One();
        obj.VehicleColour();
    }
}
