package BaekJun;

import java.util.Scanner;

public class BaekJun11121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String input = sc.next();
            String output = sc.next();

            if (input.equals(output)) {
                sb.append("OK" + "\n");
            } else {
                sb.append("ERROR" + "\n");
            }
        }

        System.out.println(sb);
    }
}
