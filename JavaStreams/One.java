package JavaStreams;

import java.util.*;

public class One {
    public void Average() {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner One = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = One.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int b = One.nextInt();
            a.add(b);
        }
        System.out.println("Average is: " + a.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));
    }

    public static void main(String[] args) {
        One obj = new One();
        obj.Average();
    }
}
