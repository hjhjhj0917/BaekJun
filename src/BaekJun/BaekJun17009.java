package BaekJun;

import java.util.Scanner;

public class BaekJun17009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[6];
        int apples = 0;
        int bananas = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();

            if (i < 3) {
                apples += scores[i] * (3 - i);
            } else {
                bananas += scores[i] * (6 - i);
            }
        }

        if (apples > bananas) {
            System.out.println("A");
        } else if (bananas > apples) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}
