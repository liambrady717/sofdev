import java.util.Scanner;

public class W3Exercise2 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fn;

        System.out.print("Enter Your First Name: ");
        fn = input.next();
        System.out.print("Hello " + fn);
    
    input.close();
    
    }
}
