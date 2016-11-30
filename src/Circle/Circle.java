package Circle;
import java.util.Scanner;
import java.lang.Math;

/**
 * Created by yleanavlaun on 11/30/16.
 */
public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userContinue = "no";


        do {
            System.out.println("Enter radius of the circle: ");
            double radius = 0;
            radius = scanner.nextDouble();

            if (radius < 0) {
                System.out.println("Invalid value entered. Please enter valid number.");
                break;

            }




            double area = 0;

            double circumference = 0;


            System.out.println("Calculating Area and Circumference of Circle ");



            area = Math.PI * radius * radius;




            circumference = 2 * Math.PI * radius;


           


            System.out.println("The Area of Circle is: " + area);
            double newArea = Math.round(area * 100.0) /100.0;
            System.out.println("The new Area of the circle is: " + newArea);

            System.out.println("The Circumference of Circle is: " + circumference);
            double newCircumference = Math.round(circumference * 100.0) /100.0;
            System.out.println("The new Circumference of the circle is: " + newCircumference);


            System.out.println("Would you like to enter another circle?");
            userContinue = scanner.next();

        } while (userContinue.equalsIgnoreCase("yes"));

    }

}
