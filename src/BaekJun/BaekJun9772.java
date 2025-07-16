package BaekJun;

import java.util.Scanner;

public class BaekJun9772 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            if (n1 == 0 && n2 == 0) {
                sb.append("AXIS" + "\n");
                break;
            }

            if (n1 > 0 && n2 > 0) {
                sb.append("Q1" + "\n");
            } else if (n1 < 0 && n2 > 0) {
                sb.append("Q2" + "\n");
            } else if (n1 < 0 && n2 < 0) {
                sb.append("Q3" + "\n");
            } else if (n1 > 0 && n2 < 0) {
                sb.append("Q4" + "\n");
            } else if (n1 == 0 || n2 == 0) {
                sb.append("AXIS" + "\n");
            }
        }

        System.out.println(sb);
    }
}
