package InputOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class One {
    public void FindFiles(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the directory path in which you want to view files/directories");
        String directoryPath = sc.next();
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Files and directories in " + directoryPath + ":");

                Arrays.stream(files)
                        .map(File::getName)
                        .forEach(System.out::println);
            } else {
                System.out.println("No files or directories found in the given directory.");
            }
        } else {
            System.out.println("The specified path is not a valid directory.");
        }
    }
    public static void main(String[] args){
        One directoryNames=new One();
        directoryNames.FindFiles();
    }
}
