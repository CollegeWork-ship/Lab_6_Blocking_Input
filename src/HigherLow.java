import java.util.Random;
import java.util.Scanner;

public class HigherLow {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Random generator = new Random();
       int val = generator.nextInt(10) + 1;
String trash = "";
       boolean done = false;
       do{
           System.out.print("Enter a number between 1 and 10: ");
           int userInput = 0;
           if (input.hasNextInt()) {
               userInput = input.nextInt();
               if (userInput == val) {
                   System.out.println("Your guess is spot on! Nice Job");
                   done = true;
               }
               if (userInput > val) {
                   System.out.println("Your guess of " + userInput + " is greater than " + val + ".");
                   done = true;
               }
               if (userInput < val) {
                   System.out.println("Your guess of " + userInput + " is less than " + val + ".");
                   done = true;
               }
           }
               else{
                   trash = input.nextLine();
               System.out.println("Please enter a number between 1 and 10. " + trash + " isn't a correct value.");
           }


           }while(!done);
       }
    }

