package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Three {
    public void VehicleColour() {
        HashMap<String, String> arr1 = new HashMap<>();
        HashMap<String, String> arr2 = new HashMap<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter size of 1st HashMap : ");
        int n = Three.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < n; i++) {
            String key = Three.next();
            String value = Three.next();
            arr1.put(key, value);
        }
        System.out.println("Enter size of 2nd HashMap : ");
        int m = Three.nextInt();
        System.out.println("Insert key and value : ");
        for (int i = 0; i < m; i++) {
            String key = Three.next();
            String value = Three.next();
            arr2.put(key, value);
        }
        arr2.putAll(arr1);
        System.out.println("after copying all mapping values from HasHmap1 to HashMap2, updated HashMap2 : " + arr2);
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.VehicleColour();
    }
}
