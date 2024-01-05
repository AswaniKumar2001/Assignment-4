package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Two {
    public void VehicleColour() {
        HashMap<String, String> arr = new HashMap<>();
        Scanner Two = new Scanner(System.in);
        System.out.println("Enter size of HashMap : ");
        int n = Two.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Two.next();
            String value = Two.next();
            arr.put(key, value);
        }
        System.out.println("size of  created HasHmap is : " + arr.size());

    }

    public static void main(String[] args) {
        Two obj = new Two();
        obj.VehicleColour();
    }
}
