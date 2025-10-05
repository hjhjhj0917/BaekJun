package BaekJun;

import java.util.Scanner;

public class BaekJun16727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] scores = new int[4];

        for (int i = 0; i < scores.length; i++) {

            scores[i] = sc.nextInt();
        }

        int Persepolis = scores[0] + scores[3];
        int Esteghlal = scores[1] + scores[2];

        if (Persepolis > Esteghlal) {

            System.out.println("Persepolis");
        } else if (Persepolis == Esteghlal) {
            if (scores[3] > scores[1]) {

                System.out.println("Persepolis");
            } else if (scores[3] == scores[1]) {

                System.out.println("Penalty");
            } else {

                System.out.println("Esteghlal");
            }
        } else {

            System.out.println("Esteghlal");
        }
    }
}
