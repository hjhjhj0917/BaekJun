package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181869 {

    static String[] solution(String my_string) {
        String[] answer = {};

        answer = my_string.split(" ");

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(Arrays.toString(solution(my_string)));
    }
}
