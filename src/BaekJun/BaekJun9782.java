package BaekJun;

import java.util.Scanner;

public class BaekJun9782 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cnt = 0;

        while (sc.hasNext()) {

            int num = sc.nextInt();
            double[] arr = new double[num];

            if (num == 0) break;

            cnt++;

            for (int i = 0; i < num; i++) {

                arr[i] = sc.nextDouble();
            }

            if (arr.length % 2 == 0) {
                sb.append("Case " + cnt + ": " + (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) /2 + "\n");
            } else {
                sb.append("Case " + cnt + ": " + arr[arr.length / 2] + "\n");
            }
        }

        System.out.println(sb);
    }
}
