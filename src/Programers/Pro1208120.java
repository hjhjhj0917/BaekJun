package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro1208120 {

    static int solution(int age) {
        int answer = 0;

        answer = 2022 - age + 1;

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(solution(age));
    }
}
