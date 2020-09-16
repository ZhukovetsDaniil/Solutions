import java.util.Scanner;
//i use only max and min in program
import static java.lang.Math.max;
import static java.lang.Math.min;

/*
 * Найти max{min{a, b}, min{c, d}}
 */
public class Task2 {
    public static void main(String[] args) {
        //input values
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        //print result to console
        System.out.println(max(min(a, b), min(c, d)));
    }
}
