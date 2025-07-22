package BaekJun;

import java.util.Scanner;

public class BaekJun11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {

            int score = sc.nextInt();

            if (score < min1) min1 = score;

            sum1 += score;
        }

        for (int i = 0; i < 2; i++) {

            int score = sc.nextInt();

            if (score < min2) min2 = score;

            sum2 += score;
        }

        System.out.println(sum1+sum2-min1-min2);
    }
}
