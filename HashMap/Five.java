package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Five {
    public void VehicleColour() {
        HashMap<String, String> arr = new HashMap<>();
        Scanner Five = new Scanner(System.in);
        System.out.println("Enter size of HashMap : ");
        int n = Five.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Five.next();
            String value = Five.next();
            arr.put(key, value);
        }
        int m = arr.size();
        if (m == 0) {
            System.out.println("Empty HashMap");
        } else {
            System.out.println("Non-Empty HashMap");
        }

    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.VehicleColour();
    }
}
