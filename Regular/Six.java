package Regular;

import java.util.Scanner;

public class Six {
    public String getLastNVowels(String inputString, int n) {
        StringBuilder vowels = new StringBuilder();
        int count = 0;

        for (int i = inputString.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(inputString.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.insert(0, ch);
                count++;

                if (count == n) {
                    break;
                }
            }
        }

        return vowels.toString();
    }
    public static void main(String[] args){
        Six lastVowels=new Six();
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER YOUR STRING AND N(INTEGER)");
        String word=scanner.next();
        int n=scanner.nextInt();
        System.out.println(lastVowels.getLastNVowels(word,n));
    }
}

