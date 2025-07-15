package BaekJun;

import java.util.Scanner;

public class BaekJun9699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int max = Integer.MIN_VALUE;

            for (int j = 0; j < 5; j++) {

                int n = sc.nextInt();
                if (max < n) max = n;
            }

            sb.append("Case #" + (i+1) + ": " + max + "\n");
        }

        System.out.println(sb);
    }
}
