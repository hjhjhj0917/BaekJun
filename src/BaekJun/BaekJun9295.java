package BaekJun;

import java.util.Scanner;

public class BaekJun9295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int  num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            sb.append("Case " + (i+1) + ": " + (n1+n2) + "\n");
        }

        System.out.println(sb);
    }
}
