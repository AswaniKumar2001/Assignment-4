package Lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class Two {
    public void emptyStringCheck(){
        Predicate<String> isEmpty = str -> str.isEmpty();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        if(isEmpty.test(str)){
            System.out.println("The String is Empty");
        }
        else{
            System.out.println("The String is not empty");
        }
    }
    public static void main(String[] args){
        Two emptyStringLambda=new Two();
        emptyStringLambda.emptyStringCheck();
    }
}
