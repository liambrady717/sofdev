import java.util.Scanner;

public class W3Exercise5 {
    
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ln;
        String fn;


        System.out.print("Enter a line number: ");
        ln = input.nextInt();
        System.out.print("Enter a sentance: ");
        fn = input.next();
 
        
        System.out.println(ln + ". " + fn);

        input.close();
 }
}