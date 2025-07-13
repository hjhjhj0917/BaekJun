package BaekJun;

import java.util.Scanner;

public class BaekJun8760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int width = sc.nextInt();
            int height = sc.nextInt();

            sb.append(((width*height)/2 + ("\n")));
        }

        System.out.println(sb);
    }
}
