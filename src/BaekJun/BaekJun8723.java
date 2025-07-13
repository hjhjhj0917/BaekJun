package BaekJun;

import java.util.Scanner;

public class BaekJun8723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int min1 = 0;
        int min2 = 0;

        if (num[0] == num[1] && num[1] == num[2]) {
            System.out.println(2);
            return;
        }

        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                min1 = Math.min(max, num[i]);
                max = Math.max(max, num[i]);
            } else {
                min2 = Math.min(max, num[i]);
                max = Math.max(max, num[i]);
            }
        }

        if (Math.pow(max, 2) == Math.pow(min1, 2) + Math.pow(min2, 2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
