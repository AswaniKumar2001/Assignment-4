package InputOutput;

import java.io.File;
import java.util.Scanner;

public class Five {
    public void FilesChecker(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the directory path in which you want to view files/directories");
        String pathName =  sc.next();

        File file = new File(pathName);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path corresponds to an existing file.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path corresponds to an existing directory.");
            } else {
                System.out.println("The specified path exists but is neither a file nor a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
    }
    public static void main(String[] args) {
        Five fileCheck=new Five();
        fileCheck.FilesChecker();
    }
}
