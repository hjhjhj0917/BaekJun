package Programers;

import java.util.Scanner;

public class Pro120814 {

    static int solution(int n) {
        int answer = 0;

        if (n <= 7) {
            answer = 1;
        } else {
            if (n % 7 == 0) {
                answer = (n / 7);
            } else {
                answer = (n / 7) + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
