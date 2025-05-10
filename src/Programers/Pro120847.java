package Programers;

import java.util.Scanner;

public class Pro120847 {

    static int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (max1 <= numbers[i]) {
                max1 = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (max1 == numbers[i]) {
                count++;
            }
        }
        if (count >= 2) {
            answer = max1 * max1;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if (max2 <= numbers[i] && max1 > numbers[i]) {
                    max2 = numbers[i];
                }
            }
            answer = max1 * max2;
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {0, 31, 24, 10, 1, 9};
        System.out.println(solution(numbers));
    }
}
