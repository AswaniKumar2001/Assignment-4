package InputOutput;

import java.io.File;
import java.util.Scanner;

public class Three {
    public void fileExistence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file path to check ");
        String filepath = sc.next();
        File file = new File(filepath);
        if (file.exists()) {
            System.out.println("Yes The file exists");
        } else {
            System.out.println("file not exist");
        }
    }

    public static void main(String[] args) {
        Three checkFileExistence = new Three();
        checkFileExistence.fileExistence();
    }
}
