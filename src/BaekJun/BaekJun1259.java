package BaekJun;

import java.util.Scanner;

public class BaekJun1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {

            String n = sc.nextLine();

            if (n.equals("0")) break;

            String reversed = new StringBuilder(n).reverse().toString();

            if (n.equals(reversed)) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }
}
