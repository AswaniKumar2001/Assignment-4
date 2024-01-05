package Lambda;

import java.util.Scanner;
import java.util.function.IntBinaryOperator;

public class One {

    public void sum(){
        IntBinaryOperator sumCalculator = (a, b) -> a + b;
        Scanner One=new Scanner(System.in);
        System.out.println("Enter two number for sum");
        int num1 =One.nextInt() ;
        int num2 = One.nextInt();

        int result = sumCalculator.applyAsInt(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
    public static void main(String[] args){
        One sumCalculatorUsingLambda=new One();
        sumCalculatorUsingLambda.sum();
    }
}
