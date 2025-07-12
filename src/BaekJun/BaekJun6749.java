package BaekJun;

import java.util.Scanner;

public class BaekJun6749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lastAge = sc.nextInt();
        int middleAge = sc.nextInt();
        int firstAge = (middleAge - lastAge) + middleAge;

        System.out.println(firstAge);
    }
}
