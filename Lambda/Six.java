package Lambda;

import java.util.*;

public class Six {
    public void Average(){
        List<Double> numbers=new ArrayList<>();
        System.out.println("Enter the length of the string");
        Scanner sc=new Scanner(System.in);
        int len= sc.nextInt();
        System.out.println("Enter the numbers");
        for(int i=0;i<len;i++){
            numbers.add(sc.nextDouble());
        }
        double average = numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("List of numbers: " + numbers);
        System.out.println("Average: " + average);
    }
    public static void main(String [] args){
        Six
     averageOfDoubles=new Six
    ();
        averageOfDoubles.Average();
    }
}
