import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double height = 0;
        double width = 0;
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.print("Enter Height: ");
            if(input.hasNext()); {
            height = input.nextDouble();
            input.nextLine();
            done = true;
        }
        }while(!done);
        do {
            System.out.print("Enter Width: ");
            if(input.hasNext());
            {
                width = input.nextDouble();
                input.nextLine();
                done = true;
            }
        }while(!done);
        double area = width * height;
        double perimeter = width + width + height + height;
        int exponent = 2;
                double diagonalSquared = Math.pow(width, exponent) + (Math.pow(height, exponent));
                double diagonal = Math.sqrt(diagonalSquared);
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}
