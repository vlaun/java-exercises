/**
 * Created by yleanavlaun on 11/11/16.
 */
public class HelloWorld {
    public static void main(String[] args){//this will be the same for every program for the next 2 weeks
//        window.console.log()

        /**
         * param what These are the arguments passed thought the terminal
         */

        int dayNumber = 5;
        long myAge = 36;  //longer number that will accept a bigger value

        float price;
        price = (float) 2.3;  //type casting.  (float) is a smaller double or smaller numbers
        double anotherPrice = 6.5; //


        char vowel;
        vowel = 'e';

        boolean isFriday = true;
        //the above types are the most common types

        String day = "\"Friday\"";

        System.out.print("Hello world!!"); //prints the line
        // or you can use psvm instead of writing out the whole command of public static void main
        /** when you run the command the result is....
         *Hello world!!
         *Process finished with exit code 0
         */
        System.out.println("Hello world!!");//prints out the line
        //you can also use sout instead of writing out System.out.print
        System.out.printf("\nHello %s, today is %s, and its the %dth day of the week", "Codeup", "Friday", 5);
                          // \n gives you new line
        /** when you run the command the result is....
        *HelloCodeup, today is Friday, and its the 5th day of the week
        *Process finished with exit code 0
         */

    }
}



