import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //input T (time in seconds)
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        //seconds
        int SS = T % 60;

        //minutes
        int MM = T / 60;

        //hours
        int HH = (MM / 60) % 24;

        //minutes should be between 0 and 59
        MM %= 60;
        //show result on console
        System.out.println(HH + "ч " + MM + "мин " + SS + "с");

    }
}
