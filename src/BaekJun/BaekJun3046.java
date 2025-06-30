package BaekJun;

import java.util.Scanner;

public class BaekJun3046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int average = sc.nextInt();
        int result = (average * 2) - r1;

        System.out.println(result);
    }
}
