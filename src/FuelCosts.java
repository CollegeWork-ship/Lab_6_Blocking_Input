import java.sql.SQLOutput;
import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args){
        double gallonsInTank = 0;
        double milesPerGallon = 0;
        double priceOfGas = 0;
        String trash = "";
        String trash2 = "";
        String trash3 = "";
Scanner in = new Scanner(System.in);
boolean done = false;
do {
   System.out.print("Enter Gallons in Tank: ");
   if (in.hasNextDouble()) {
       gallonsInTank = in.nextDouble();
       in.nextLine();
       done = true;
   }
   else {
       trash = in.nextLine();
       System.out.println("The amount you entered is " + trash);
       System.out.println("You need to enter a correct amount");
   }
}while (!done);
do {
    System.out.print("Enter Miles per  Gallon: ");
    if (in.hasNextDouble()) {
        milesPerGallon = in.nextDouble();
        in.nextLine();
        done = true;
    }
    else {
        trash2 = in.nextLine();
        System.out.println("The amount you entered is " + trash2);
        System.out.println("You need to enter a correct amount");
    }
} while (!done);
do {
    System.out.print("Enter Price of Gas: ");
    if (in.hasNextDouble()) {
        priceOfGas = in.nextDouble();
        in.nextLine();
        done = true;
    }
    else {
        trash3 = in.nextLine();
        System.out.println("The amount you entered is " + trash3);
        System.out.println("You need to enter a correct amount");
    }
}while (!done);
double hundredMilesCost = (100 / milesPerGallon) * priceOfGas;
        System.out.println("The cost to drive 100 miles would be " + "$" + hundredMilesCost);
        double fullGasDistance = gallonsInTank * milesPerGallon;
        System.out.println("The distance you can go on a full tank of gas is " + fullGasDistance + " miles");
    }
}
