package Programers;

import java.util.Scanner;

public class Pro120898 {

    static int solution(String message) {
        int answer = 0;

        answer = message.length() * 2;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String message = sc.nextLine();
        System.out.println(solution(message));
    }
}
