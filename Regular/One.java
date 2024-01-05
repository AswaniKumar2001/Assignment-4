package Regular;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class One {
    public void thousandSeperator(){
        Scanner One=new Scanner(System.in);
        System.out.println("Please enter the number");
        double number=One.nextDouble();
        NumberFormat decimalFormat = new DecimalFormat("#,###.##");
        String formattedNumber = decimalFormat.format(number);

        System.out.println("Original Number: " + number);
        System.out.println("Number with Thousand Separator: " + formattedNumber);
    }

    public static void main(String[] args){
        One seperator=new One();
        seperator.thousandSeperator();
    }
}
