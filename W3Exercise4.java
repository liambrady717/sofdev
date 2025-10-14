import java.util.Scanner;

public class W3Exercise4 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fn;
        int wn;
        double dn;

        System.out.print("Enter First Name: ");
        fn = input.next();
        System.out.print("Enter a whole number: ");
        wn = input.nextInt();
        System.out.print("Enter a decimal number: ");
        dn = input.nextDouble();
        
        System.out.println(fn + ", you entered the numbers " + wn + " and " + dn);

        input.close();

    }       
}
