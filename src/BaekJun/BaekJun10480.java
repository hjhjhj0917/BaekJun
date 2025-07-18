package BaekJun;

import java.util.Scanner;

public class BaekJun10480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int number = sc.nextInt();

            if (number % 2 == 0) {
                sb.append(number + " is even" + "\n");
            } else {
                sb.append(number + " is odd" + "\n");
            }
        }

        System.out.println(sb);
    }
}
