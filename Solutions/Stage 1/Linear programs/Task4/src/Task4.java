import java.util.Scanner;

/*
 *Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях)
 * Поменять местами дробную и целую части числа и вывести полученное значение числа
 */
public class Task4 {
    public static void main(String[] args) {
        //read number
        Scanner scanner = new Scanner(System.in);
        double val = scanner.nextDouble();

        //whole part
        double nnn = (int)val;
        //fractional part
        double ddd = (int)((val - nnn) * 1000);

        //swap whole and fractional parts
        double result = ddd + nnn / 1000;
        //show result on console
        System.out.println(result);
    }
}
