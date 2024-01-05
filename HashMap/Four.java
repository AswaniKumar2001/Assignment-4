package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Four {
    public void VehicleColour() {
        HashMap<String, String> arr = new HashMap<>();
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter size of HashMap : ");
        int n = Four.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Four.next();
            String value = Four.next();
            arr.put(key, value);
        }
        arr.clear();
        System.out.println("HashMap after clearing it : " + arr);

    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.VehicleColour();
    }
}
