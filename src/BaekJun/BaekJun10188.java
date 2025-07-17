package BaekJun;

import java.util.Scanner;

public class BaekJun10188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int width = sc.nextInt();
            int height = sc.nextInt();

            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    sb.append("X");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
