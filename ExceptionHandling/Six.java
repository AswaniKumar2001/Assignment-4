package ExceptionHandling;

import java.lang.reflect.Array;
import java.util.*;

public class Six {

    public void vowelFinder() throws Exception {

        Scanner Six = new Scanner(System.in);
        System.out.println("please enter the string");
        String inputString = Six.next();
        if (inputString.indexOf('a') != -1 || inputString.indexOf('e') != -1 || inputString.indexOf('i') != -1
                || inputString.indexOf('o') != -1 || inputString.indexOf('u') != -1) {
            System.out.println("Input is Noted");
        } else {
            throw new Exception("Vowel Not Found");
        }
    }

    public static void main(String[] args) {
        try {
            Six vowelNotFound = new Six();
            vowelNotFound.vowelFinder();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
