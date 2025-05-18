package Programers;

import java.util.Scanner;

public class Pro120895 {

    static String solution(String my_string, int num1, int num2) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer += my_string.charAt(num2);
            } else if (i == num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(solution(my_string, num1, num2));
    }
}
