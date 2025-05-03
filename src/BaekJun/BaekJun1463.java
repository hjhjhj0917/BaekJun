package BaekJun;

import java.util.Scanner;

public class BaekJun1463 {

    // 정수 N이 주어졌을 때, 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a =  num;
        int count = 0;
        int cnt = 0;

        while (num > 1) {

            if (num % 3 == 1) {
                num -= 1;
            } else {
                if (num % 3 == 0) {
                    num /= 3;
                } else if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                }
            }
            count++;
        }
        while (a > 1) {

            if (a % 2 == 1) {
                a -= 1;
            } else {
                if (a % 2 == 0) {
                    a /= 2;
                } else if (a % 3 == 0) {
                    a /= 3;
                } else {
                    a -= 1;
                }
            }
            cnt++;
        }
        if (cnt < count) {
            System.out.println(cnt);
        } else if (count < cnt){
            System.out.println(count);
        } else {
            System.out.println(count);
        }
    }
}
