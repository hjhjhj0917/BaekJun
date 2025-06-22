package Programers;

import java.util.Scanner;

public class Pro181839 {

    static int solution(int a, int b) {
        int answer = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            answer = (int)(Math.pow(a, 2) + Math.pow(b, 2));
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solution(a, b));
    }
}
