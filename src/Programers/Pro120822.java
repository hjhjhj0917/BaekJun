package Programers;

import java.util.Scanner;

public class Pro120822 {

    static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            answer.append(my_string.charAt(my_string.length() - (i + 1)));
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();

        System.out.println(solution(my_string));
    }
}
