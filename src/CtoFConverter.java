import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CtoFConverter {
    public static void main(String[] args) {
        double celsius = 0;
        double fahrenheit = celsius * 9 / 5 + 32;
        String trash = "";
Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter temperature in Celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Your temperature in fahrenheit is " + fahrenheit);
                in.nextLine();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("The temperature you entered was " + trash);
                System.out.println("You must enter a valid temperature");
            }
    } while(!done);

    }
}