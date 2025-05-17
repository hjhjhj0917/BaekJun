package Programers;

import java.util.Scanner;

public class Pro181940 {

    static String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(solution(my_string, k));
    }
}
