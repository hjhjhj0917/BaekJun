package BaekJun;

import java.util.Scanner;

public class BaekJun11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if (cols == 0 || rows == 0) return; // 0인 조건 추가하기

        sc.nextLine();

        for (int i = 0; i < rows; i++) {

            String line = sc.nextLine();

            for (int j = cols - 1; j >= 0; j--) {

                sb.append(line.charAt(j));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
