package Programers;

import java.util.Scanner;

public class Pro181906 {

    static int solution(String my_string, String is_prefix) {
        int answer = 0;

        if (my_string.startsWith(is_prefix)) { // 접두사인지 확인하는 메서드
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        String is_prefix = sc.nextLine();
        System.out.println(solution(my_string, is_prefix));
    }
}
