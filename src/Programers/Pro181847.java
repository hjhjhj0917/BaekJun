package Programers;

import java.util.Scanner;

public class Pro181847 {

    static String solution(String n_str) {
        String answer = "";

        for (int i = 0; i < n_str.length(); i++) {

            if (n_str.charAt(i) != '0' ) {

                for (int j = i; j < n_str.length(); j++) {
                    answer += n_str.charAt(j);
                }
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n_str = sc.nextLine();
        System.out.println(solution(n_str));
    }
}
