package Programers;

import java.util.Scanner;

public class Pro120585 {

    static int solution(int[] array, int height) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            if (height < array[i]) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {149, 180, 192, 170};
        int height = sc.nextInt();

        System.out.println(solution(array, height));
    }
}
