package Programers;

import java.util.Scanner;

public class Pro120851 {

    static int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(solution(my_string));
    }
}
