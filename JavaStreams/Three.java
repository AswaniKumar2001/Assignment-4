package JavaStreams;

import java.util.*;

public class Three {
    public void EvenOdd() {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner Three = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = Three.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int b = Three.nextInt();
            a.add(b);
        }
        System.out.println(
                "Sum of Even numbers : " + a.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum());
        System.out.println(
                "Sum of Odd numbers : " + a.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum());
    }

    public static void main(String[] args) {
        Three obj = new Three();
        obj.EvenOdd();
    }
}
