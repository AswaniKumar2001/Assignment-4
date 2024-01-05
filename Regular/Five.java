package Regular;

import java.util.Scanner;

public class Five {
    public  void separateConsonantsAndVowels(String inputString) {
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels.append(ch).append(" ");
                } else {
                    consonants.append(ch).append(" ");
                }
            }
        }

        System.out.println("Vowels: " + vowels.toString());
        System.out.println("Consonants: " + consonants.toString());
    }
    public static void main(String[] args){
        Five Five=new Five();
        Scanner scanner=new Scanner(System.in);
        Five.separateConsonantsAndVowels(scanner.next());
    }
}