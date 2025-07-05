package BaekJun;

import java.util.Scanner;

public class BaekJun5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        for (int i = 0; i < 4; i++) {

            int seconds = sc.nextInt();
            sum += seconds;
        }

        sb.append(sum/60 + "\n" + sum%60);
        System.out.println(sb);
    }
}
