package ExceptionHandling;

import java.util.*;
import java.io.File;

public class Two {
    public void fileExistence() throws Exception {
        Scanner Two = new Scanner(System.in);
        System.out.println("Please enter the file path to check ");
        String filepath = Two.next();
        File file = new File(filepath);
        if (!file.exists()) {
            throw new Exception("File Does Not Exist");
        } else {
            System.out.println("Everything Fine");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            Two fileNotFoundException = new Two();
            fileNotFoundException.fileExistence();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
