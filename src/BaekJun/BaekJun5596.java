package BaekJun;

import java.util.Scanner;

public class BaekJun5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hap1 = 0;
        int hap2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                int score = sc.nextInt();
                if (i == 0) hap1 += score;
                if (i == 1) hap2 += score;
            }
        }

        System.out.println(Math.max(hap1, hap2));
    }
}
