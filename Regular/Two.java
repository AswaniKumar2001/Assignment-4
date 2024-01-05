package Regular;

import java.util.Scanner;

public class Two {
    public void alphaNumericRemover(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the string");
        String inputString =scanner.next();

        // Remove all non-alphanumeric characters using regular expression
        String resultString = inputString.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("Original String: " + inputString);
        System.out.println("String after removing non-alphanumeric characters: " + resultString);
    }
    public static void main(String[] args){
        Two remover=new Two();
        remover.alphaNumericRemover();
    }
}