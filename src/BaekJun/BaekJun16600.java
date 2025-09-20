package BaekJun;

import java.util.Scanner;

public class BaekJun16600 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();  // 넓이 a
        double side = Math.sqrt(a);  // 한 변 길이
        double perimeter = 4 * side;  // 둘레

        System.out.printf("%.9f\n", perimeter);  // 소수점 9자리까지 출력 (오차 보장)

        sc.close();
    }
}
