package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class One {
    public void VehicleColour() {
        HashMap<String, String> arr = new HashMap<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter size of HashMap : ");
        int n = One.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = One.next();
            String value = One.next();
            arr.put(key, value);
        }
        System.out.println("after key associated with value, HashMap is : ");
        System.out.println(arr);

    }

    public static void main(String[] args) {
        One obj = new One();
        obj.VehicleColour();
    }
}
