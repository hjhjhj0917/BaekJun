package Programers;

import java.util.Scanner;

public class Pro120825 {

    static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(solution(my_string, n));
    }
}
