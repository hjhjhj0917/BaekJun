package BaekJun;

import java.util.Scanner;

public class BaekJun17010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int number = sc.nextInt();
            String text = sc.next();

            for (int j = 0; j < number; j++) {
                sb.append(text);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
