package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Two {
    public void UpperCase(ArrayList<String> a) {

        System.out.println("upper case : " + a.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }

    public void LowerCase(ArrayList<String> a) {
        System.out.println("Lower case : " + a.stream().map(String::toLowerCase).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner Two = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = Two.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            String b = Two.next();
            a.add(b);
        }
        Two obj = new Two();
        obj.UpperCase(a);
        obj.LowerCase(a);

    }
}
