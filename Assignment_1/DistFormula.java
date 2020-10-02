import java.util.Scanner;

class DistFormula {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double x1,x2,y1,y2 = 0;
        double dist = 0;

        //get user input
        System.out.println("DistFormula");
        System.out.println("-------------------");
        System.out.println("");
        System.out.print("Enter the first x coordinate ");
        x1 = sc.nextDouble();
        System.out.print("Enter the first y coordinate ");
        y1 = sc.nextDouble();
        System.out.print("Enter the second x coordinate ");
        x2 = sc.nextDouble();
        System.out.print("Enter the second y coordinate ");
        y2 = sc.nextDouble();
   

        //calculates and display
        dist=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println("The distance between the two coordinates is " + dist + " units");
    }

}
