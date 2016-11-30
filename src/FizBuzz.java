/**
 * Created by yleanavlaun on 11/14/16.
 */
public class FizBuzz {
    public static void main(String[] args) {

        System.out.println("FizBuzz.main");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}