package Programers;

import java.util.Scanner;

public class Pro120906 {

    static int solution(int n) {
        int answer = 0;

        String numStr = String.valueOf(n);

        int[] digits = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        for (int i = 0; i < digits.length; i++) {
            answer += digits[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
