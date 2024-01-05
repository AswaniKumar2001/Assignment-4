package JavaStreams;

import java.util.*;

public class Five {
    public void StringLetter() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner Five = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = Five.nextInt();
        System.out.println("Enter Strings: ");
        for (int i = 0; i < n; i++) {
            arr.add(Five.next());
        }
        System.out.println("Enter the letter, to search the string : ");
        String a = Five.next();
        System.out.println("count of strings, start with letter " + a + " is : "
                + arr.stream().filter(s -> s.startsWith(String.valueOf(a))).count());
    }

    public static void main(String[] args) {
        Five obj = new Five();
        obj.StringLetter();
    }

}
