package Programers;

import java.util.Scanner;

public class Pro120583 {
    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1, 1, 2, 3, 4, 5};
        int n = sc.nextInt();

        System.out.println(solution(array, n));
    }
}
