package BaekJun;

import java.util.Scanner;

public class BaekJun13297 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String line = sc.nextLine();

            sb.append(line.length() + "\n");

        }

        System.out.println(sb);
    }
}
