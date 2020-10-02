import java.util.Scanner;

class AreaToRadius {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double area = 0;

        //get user input
        System.out.println("AreaToRadius");
        System.out.println("-------------------");
        System.out.println("");
        System.out.print("Enter the Radius ");
        x = sc.nextDouble();
   

        //calculations
        area = Math.PI*Math.pow(x,2);
        System.out.println("The radius of the circle is " + area + " units^2");
    }

}
