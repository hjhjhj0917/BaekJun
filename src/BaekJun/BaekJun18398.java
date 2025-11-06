package BaekJun;

import java.util.Scanner;

public class BaekJun18398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int testCase = sc.nextInt();

        if (testCase < 1 || testCase > 10) return;

        for (int i = 0; i < testCase; i++) {

            int pair = sc.nextInt();

            if (pair < 1 || pair > 50) return;

            for (int j = 0; j < pair; j++) {
                int val1 = sc.nextInt();
                int val2 = sc.nextInt();

                sb.append((val1 + val2) + " " + (val1 * val2) + "\n");
            }
        }

        System.out.println(sb);
    }
}
