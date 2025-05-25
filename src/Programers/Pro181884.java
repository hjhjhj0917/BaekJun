package Programers;

import java.util.Scanner;

public class Pro181884 {

    static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (answer <= n) {
                answer += numbers[i];
            } else {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = sc.nextInt();
        System.out.println(solution(numbers, n));
    }
}
