package BaekJun;

import java.util.Scanner;

public class BaekJun9306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            String firstName = sc.nextLine();
            String familyName = sc.nextLine();

            sb.append("Case " + (i+1) + ": " + familyName + ", " + firstName + "\n");
        }

        System.out.println(sb);
    }
}
