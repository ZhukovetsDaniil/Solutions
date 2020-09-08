/*
 * Вычислить значение выражения по формуле
 * (все переменные принимают действительные значения)
 * (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(x * y)
 */
public class Task3 {
    public static void main(String[] args) {
        //set values for variables
        double x = -30;
        double y = 45;

        //calculate value of expression for specified values
        double result = (Math.sin(x) + Math.cos(y)) /
                        (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);

        //display result to standard output (console)
        System.out.println(result);
    }
}
