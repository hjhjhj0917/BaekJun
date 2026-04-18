package Programers;

import java.util.Scanner;

public class Pro120804 {
    public static int solution(int num1, int num2) {
        int answer = 0;

        answer = num1 * num2;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(num1, num2));
    }
}
