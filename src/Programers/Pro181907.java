package Programers;

import java.util.Scanner;

public class Pro181907 {

    static String solution(String my_string, int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(solution(my_string, n));
    }
}
