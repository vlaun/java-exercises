/**
 * Created by yleanavlaun on 11/21/16.
 */
import java.util.Scanner;

public enum Color {
    RED(0.0), BLUE(0.1), YELLOW(0.25), GREEN(0.35), PURPLE(0.50), PINK(1.0);

    private final double discount;

    Color(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double payment) {
        double totalDiscount;
        totalDiscount = payment * this.discount;
        return totalDiscount;
    }
}
