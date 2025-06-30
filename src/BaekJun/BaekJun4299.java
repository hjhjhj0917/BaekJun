package BaekJun;

import java.util.Scanner;

public class BaekJun4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();
        int diff = sc.nextInt();

        if ((sum + diff) % 2 != 0 || (sum - diff) < 0) {
            System.out.println(-1);
            return;
        }

        int scoreA = (sum + diff) / 2;
        int scoreB = (sum - diff) / 2;

        if (scoreA >= 0 && scoreB >= 0) {
            if (scoreA > scoreB) {

                System.out.println(scoreA + " " + scoreB);
            } else {

                System.out.println(scoreB + " " + scoreA);
            }
        } else {

            System.out.println(-1);
        }
    }
}
