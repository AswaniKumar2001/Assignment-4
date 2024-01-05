package InputOutput;

import java.io.File;
import java.util.Scanner;

public class Four {
    public void permissionsToAFile() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file path to check permissions");
        String filepath = sc.next();
        File file = new File(filepath);
        if (file.exists()) {
            if (file.canRead()) {
                if (file.canWrite()) {
                    System.out.println("The file has read and write permissions");
                } else {
                    System.out.println("The file has read permission but does not have write permissions");
                }
            } else if (file.canWrite()) {
                System.out.println("The file doesn't have read permission but has write permission");
            } else {
                System.out.println("The file doesn't have read and write permissions");
            }
        } else {
            System.out.println("file doesnot exist");
        }
    }

    public static void main(String[] args) {
        Four checkRandWPermissions = new Four();
        checkRandWPermissions.permissionsToAFile();
    }
}
