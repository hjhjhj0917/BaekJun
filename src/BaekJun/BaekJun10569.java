package BaekJun;

import java.util.Scanner;

public class BaekJun10569 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            int vertex = sc.nextInt();
            int edge = sc.nextInt();

            sb.append((2 + edge - vertex) + "\n");
        }

        System.out.println(sb);
    }
}
