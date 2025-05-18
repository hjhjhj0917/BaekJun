package Programers;

import java.util.Scanner;

public class Pro120892 {

    static String solution(String cipher, int code) {
        String answer = "";

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cipher = sc.nextLine();
        int code = sc.nextInt();
        System.out.println(solution(cipher, code));
    }
}
