package BaekJun;

import java.util.Scanner;

public class BaekJun18691 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int cnt = sc.nextInt();

        for (int i = 0; i < cnt; i++) {

            int group = sc.nextInt();
            int current = sc.nextInt();
            int evolution = sc.nextInt();

            int diff = Math.max(0, evolution - current); // 부족한 사탕 개수 (최소 0)

            int km = 0;
            if (group == 1) km = diff * 1;
            else if (group == 2) km = diff * 3;
            else if (group == 3) km = diff * 5;

            sb.append(km).append("\n");
        }

        System.out.println(sb);
    }
}
