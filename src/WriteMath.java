/**
 * Created by yleanavlaun on 11/14/16.
 */
//public class WriteMath {
//    public static void main(String[] args) {
//
//
//    }
//}

//        {
//            //the statements of the method
//        }

//        int i = 175;
//        int j = 250;
//        int y = i + j;
//        System.out.println("i + j = " + (i + j));
//        {
//            int a = 30;
//            int b = 12;
//            int t = a - b;
//            System.out.println("a - b = " + (a - b));
//            {
//
//                int c = 35;
//                int d = 54;
//                int x = c * d;
//                System.out.println("c * d = " + (c * d));
//            }
//            {
//                int e = 5678;
//                int f = 86;
//                int g = e / f;
//                System.out.println("e/f = " + (e/f)); {
//
//                int m = 56;
//                int n = 3;
//                int s = m % n;
//                System.out.println("m % n is " + s);
//
//            }
//
//            }
//        }
//    }
//}


//Factorial Number:

import java.util.Scanner;
//public class WriteMath {
//    public static void main(String[] args) {
//
//        calculateFactorial();
//    }
//
//    public static void calculateFactorial() {
//        Scanner sc = new Scanner(System.in);;
//        String choice = "y";
//        System.out.println("Welcome to the Factorial Calculator!");
//        while (choice.equalsIgnoreCase("y")) {
//            System.out.println("Enter an integer that's greater than 0 but less than 10;");
//            Integer input = sc.nextInt();
//            Long fact = 1L;
//            if(input < 0 || input > 10) {
//                System.out.println("The input is not valid");
//                break;
//            }
//
//            String output = "1";
//
//            for (int i=1;i<input;i++) {
//                fact = fact * i;
//                if(i !=1) {
//                    output += "x" + i; //+= whatever you have plus next value
//                }
//                System.out.println(i+"!=  output +   = "+fact);
//            }
//            System.out.println("The factorial of "+input+" is " + fact);
//            System.out.println("Do you wish to continue? (y/n):");
//            choice = sc.next();
//            System.out.println();
//        }
//
//    }
//}


//BONUS QUESTION:
public class WriteMath {
    public static Integer generateRnd(Integer sides) {
        Integer res = (int) Math.ceil(Math.random() * sides);
        return res;
    }

    public static void main(String[] args) {

        rollDice();
    }
    public static void rollDice() {
        WriteMath obj = new WriteMath();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        Integer i = 1;
        System.out.println("Welcome to the Casino!");
        while (choice.equalsIgnoreCase("y")){
            System.out.println("How many sides should each dice have?");
            Integer input = sc.nextInt();

            Integer rnd1 = generateRnd(input);
            Integer rnd2 = generateRnd(input);

            System.out.println("Roll " + i + ": " + rnd1 + " " + rnd2); //"i" is the amount of times you play
            System.out.println();
            System.out.println("Roll again? (y/n): ");
            choice = sc.next(); //the output will be the result of the next input
            System.out.println();
            i++;
        }
    }
}
