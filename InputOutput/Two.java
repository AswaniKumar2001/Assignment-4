package InputOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public void findWithExtension() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the directory path in which you want to view files/directories");
        String directoryPath = sc.next(); // Replace with your directory path
        System.out.println("please enter the extension of the file");
        String extension ="."+sc.next(); // Replace with the desired extension

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(extension.toLowerCase()));

            if (files != null && files.length > 0) {
                System.out.println("Files with extension " + extension + " in " + directoryPath + ":");

                Arrays.stream(files)
                        .map(File::getName)
                        .forEach(System.out::println);
            } else {
                System.out.println("No files with extension " + extension + " found in the given directory.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }

    public static void main(String[] args){
        Two filesWithExtension=new Two();
        filesWithExtension.findWithExtension();
    }

}
