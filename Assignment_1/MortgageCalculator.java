
import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double P,r,n = 0;
        double mortgage = 0;

        //get user input
        System.out.println("MortgageCalculator");
        System.out.println("-------------------");
        System.out.println("");
        System.out.print("Enter the value for P (principal amount) ");
        P = sc.nextDouble();
        System.out.print("Enter the value for r (in decimals) ");
        r = sc.nextDouble(); 
        System.out.print("Enter the value for n (# of years) ");
        n = sc.nextDouble();
       
   

        //calculations and display
        mortgage=P*Math.pow(1+r,n);
        System.out.println("The simple interest value is  $" + mortgage);
    }

}
