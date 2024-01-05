package ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Five {
    public void DuplicateNumberChecker() throws Exception {
        Scanner Five = new Scanner(System.in);
        List<Integer> NumbersList = new ArrayList<>();
        System.out.println("Enter the length of the list you want to create ");
        int n = Five.nextInt();
        System.out.println("Enter elements into the list:");
        for (int i = 0; i < n; i++) {
            int a = Five.nextInt();
            if (NumbersList.contains(a)) {
                throw new Exception("Duplicate Number Found");
            }
            NumbersList.add(a);
        }
        System.out.println(NumbersList);
    }

    public static void main(String[] args) {
        try {
            Five duplicateNUmberException = new Five();
            duplicateNUmberException.DuplicateNumberChecker();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
