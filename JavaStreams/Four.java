package JavaStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Four {
    public void Duplicate() {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = Four.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int b = Four.nextInt();
            a.add(b);
        }
        System.out.println("After removing Duplicates : " + a.stream().distinct().collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        Four obj = new Four();
        obj.Duplicate();
    }
}
