package BaekJun;

import java.util.Scanner;

public class BaekJun2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxScore = Integer.MIN_VALUE;
        int participation = 0;

        for (int i = 0; i < 5; i++) {

            int result = 0;

            for (int j = 0; j < 4; j++) {

                result += sc.nextInt();
            }

            if (result > maxScore) {
                maxScore = result;
                participation = i + 1;
            }
        }

        System.out.println(participation + " " + maxScore);
    }
}
