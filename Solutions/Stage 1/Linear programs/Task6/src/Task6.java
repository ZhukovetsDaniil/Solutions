import java.util.Scanner;

/*
 * Для данной области составиьт линейную программу, которая печатает true,
 * если точка с координатами (x, y) принадлежит закрашенной области,
 * и false в противном случае
 *              Y
 *             |
 *           +--+--+
 *           |  |  |
 *           |  |  |
 *           | 2|1 |
 *           |  |  |
 * --------+-+--+--+-+------------>X
 *         |    |    |
 *         |   3|4   |
 *         |    |    |
 *         +----+----+
 *              |
 * отверстие диаметром 1 и центром в (0;-1)
 *
 */
public class Task6 {
    public static void main(String[] args) {
        //input point coordinates
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (((x >= 0 && x <= 2 && y >= 0 && y <= 4) ||//is point in area 1
                (x >= -2 && x <= 0 && y >= 0 && y <= 4) || // is point in area 2
                (x >= -4 && x <= 0 && y >= -3 && y <= 0) || // is point in area 3
                (x >= 0 && x <= 4 && y >= -3 && y <= 0)) && // is point in area 4
                !isInCircle(0, -1, 0.5, x, y)){ //is point in circle
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

    // check if point in circle
    private static boolean isInCircle(double centerX, double centerY, double radius, double pointX, double pointY){
       return (Math.pow(pointX - centerX,2) + Math.pow(pointY - centerY,2) < Math.pow(radius, 2));
    }
}
