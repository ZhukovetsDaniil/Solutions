import java.util.Scanner;

/*
 * Даны два угла (в градусах). Определить, существует ли такой треугольник
 * и если да, то будет ли он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstAngle = scanner.nextDouble();
        double secondAngle = scanner.nextDouble();

        //law of triangle: sum of all angles must equal 180 degree
        if (firstAngle > 0 && secondAngle > 0 &&
                firstAngle + secondAngle < 180) {

            //if any of angle is equal to 90 degree then triangle is rectangle
            if (firstAngle == 90 || secondAngle == 90 ||
                    180 - firstAngle - secondAngle == 90) {
                System.out.println("Triangle is rectangle");
            } else {
                System.out.println("Triangle is not rectangle");
            }

        } else {
            System.out.println("Triangle does not exist");
        }

    }
}
