package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Four {
    public void seperateEvenOddList(){
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers= new ArrayList<>();
        System.out.println("Please enter the length of list");
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        System.out.println("Now please enter the list of numbers");
        for(int i=0;i<len;i++){
            Integer str= sc.nextInt();
            numbers.add(str);
        }
        // Filter even numbers using lambda expression
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Filter odd numbers using lambda expression
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("The original list"+numbers);
        System.out.println("The list of oddNumbers"+oddNumbers);
        System.out.println("The list of evenNumbers"+evenNumbers);

    }
    public static void main(String[] args){
        Four sepearateList=new Four();
        sepearateList.seperateEvenOddList();
    }
}
