package BaekJun;

import java.util.Scanner;

public class BaekJun11257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int studentNum = sc.nextInt();
            int strategy = sc.nextInt();
            int management = sc.nextInt();
            int technology = sc.nextInt();
            int sum = strategy + management + technology;

            if (sum >= 55) {
                if (strategy < 10.5 || management < 7.5 || technology < 12) {
                    sb.append(studentNum + " " + sum + " " + "FAIL" + "\n");
                } else {
                    sb.append(studentNum + " " + sum + " " +  "PASS" + "\n");
                }
            } else {
                sb.append(studentNum + " " + sum  + " " +  "FAIL" + "\n");
            }
        }

        System.out.println(sb);
    }
}
