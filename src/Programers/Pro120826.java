package Programers;

import java.util.Scanner;

public class Pro120826 {

    static String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replaceAll(letter, "");

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        String letter = sc.nextLine();

        System.out.println(solution(my_string, letter));
    }
}
