import java.util.Scanner;

public class W3Exercise3 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double fn;

        System.out.print("Enter a decimal number: ");
        fn = input.nextDouble();
        System.out.print("The number is: " + fn);
 
    input.close();
    }
}