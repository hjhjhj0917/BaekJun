package BaekJun;

import java.util.Scanner;

public class BaekJun15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        System.out.println((num1 + num2) * (num1 - num2));
    }
}

