package BaekJun;

import java.util.Scanner;

public class BaekJun18408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oneCount = 0;
        int twoCount = 0;

        for (int i = 0; i < 3; i++) {

            int val = sc.nextInt();

            if (val == 1) {
                oneCount++;
            } else if (val == 2) {
                twoCount++;
            }
        }

        if (oneCount > twoCount) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
