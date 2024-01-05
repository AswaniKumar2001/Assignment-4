package TreeMap;

import java.util.*;

public class Five {
    public void VehicleColour() {
        TreeMap<String, String> arr = new TreeMap<>();
        Scanner Five = new Scanner(System.in);
        System.out.println("Enter size of TreeMap : ");
        int n = Five.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Five.next();
            String value = Five.next();
            arr.put(key, value);
        }
        Set<String> set = arr.keySet();
        System.out.println("keys in Treemap are: " + set);
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.VehicleColour();
    }
}
