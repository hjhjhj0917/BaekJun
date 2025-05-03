package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro120909 {

    static int solution(int n) {
        int answer = 0;

        if (Math.sqrt(n) == (int)Math.sqrt(n)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println((solution(n)));
    }
}
