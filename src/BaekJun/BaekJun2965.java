package BaekJun;

import java.util.Scanner;

public class BaekJun2965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(Math.max(Math.abs(n1 - n2) - 1, Math.abs(n2 - n3) - 1));
    }
}
