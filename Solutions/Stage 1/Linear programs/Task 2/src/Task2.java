/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (b + sqrt(b^2 + 4*a*c))/ 2*a - a^3 * c + b^(-2)
 *
 */
public class Task2 {
    public static void main(String[] args) {
        //set values for variables
        double a = 10;
        double b = 12;
        double c = 1;
        //calculate expression
        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a -
                        Math.pow(a, 3) * c + Math.pow(b, -2);
        //display result to standard output stream (console)
        System.out.println(result);
    }
}
