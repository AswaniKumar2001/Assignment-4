package ExceptionHandling;

import java.util.Scanner;

public class One {
    public void checkEvenNumber() throws Exception {
        Scanner One = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int number = One.nextInt();
        if (number % 2 != 0) {
            throw new Exception("The number is odd. Even numbers only allowed.");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            One oddException = new One();
            oddException.checkEvenNumber();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
