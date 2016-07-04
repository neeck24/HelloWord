package packej;

import java.util.Scanner;

public class AngleClock {
    public static void main(String[] args) {

        double angle;

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите часы: ");
        long hours = scan.nextInt();
        System.out.print("Введите минуты: ");
        long minets = scan.nextInt();
        angle = Math.abs(minets * 6 - (hours * 30 + minets * 0.5));

        int ostatok = (int) angle / 360;
        angle = angle - ostatok * 360;

        System.out.println("Угол между стрелками: " + angle + "˚");
    }
}



