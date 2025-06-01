package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181901 {

    static int[] solution(int n, int k) {
        int[] answer = {};

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Arrays.toString(solution(n, k)));
    }
}
