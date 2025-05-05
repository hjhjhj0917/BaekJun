package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120819 {

    static int[] solution(int money) {
        int[] answer = new int[2];

        if (money >= 5500) {
            answer[0] = money / 5500;
            answer[1] = money % 5500;
        } else {
            answer[1] = money;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        System.out.println(Arrays.toString(solution(money)));
    }
}
