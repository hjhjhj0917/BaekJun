package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181909 {

    static String[] solution(String my_string) {
        String[] answer = {};

        for (int i = 0; i < my_string.length(); i++) {

            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = "";

            for (int j = i; j < my_string.length(); j++) {

                answer[answer.length-1] += my_string.charAt(j);
            }
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(Arrays.toString(solution(my_string)));
    }
}
