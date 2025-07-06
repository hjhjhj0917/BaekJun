package BaekJun;

import java.util.Scanner;

public class BaekJun5928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int elapsedMin = (day - 11) * 24 * 60 + (hour - 11) * 60 + (min - 11);

        if (elapsedMin < 0) {
            System.out.println(-1);
        } else {
            System.out.println(elapsedMin);
        }
    }
}

