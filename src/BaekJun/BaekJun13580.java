package BaekJun;

import java.util.Scanner;

public class BaekJun13580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] credits = new int[3];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        boolean result = false;

        for (int i = 0; i < credits.length; i++) {
            credits[i] = sc.nextInt();

            if (credits[i] > max) {
                max = credits[i];
            }
            sum += credits[i];
        }

        for (int i = 0; i < credits.length-1; i++) {
            if (credits[0] == credits[i+1]) {
                result = true;
            } else if (credits[1] == credits[2]) {
                result = true;
            }
        }

        if (sum / max == 2 && sum % max == 0) {
            result = true;
        }

        if (result) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
