package ExceptionHandling;

import java.io.*;
import java.util.*;;

public class Four {
    public void EmptyFileChecker() throws Exception {
        Scanner Four = new Scanner(System.in);
        System.out.println("Enter the file path");
        String fileName = Four.next(); // Replace with your file name
        File file = new File(fileName);
        if (file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            if (br.readLine() == null) {
                throw new Exception("Four");
            } else {
                System.out.println("EVERYTHING IS FINE");
            }
        } else {
            throw new Exception("File Not Found EXception");
        }
    }

    public static void main(String[] args) {
        try {
            Four emptyFileException = new Four();
            emptyFileException.EmptyFileChecker();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
