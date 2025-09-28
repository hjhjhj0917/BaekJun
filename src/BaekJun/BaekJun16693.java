package BaekJun;

import java.util.Scanner;

public class BaekJun16693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A1 = sc.nextInt();
        int P1 = sc.nextInt();

        int R1 = sc.nextInt();
        int P2 = sc.nextInt();

        double ratioSlice = (double) A1 / P1;
        double ratioWhole = Math.PI * R1 * R1 / P2;

        if (ratioWhole > ratioSlice) {
            System.out.println("Whole pizza");
        } else {
            System.out.println("Slice of pizza");
        }

        sc.close();
    }
}
