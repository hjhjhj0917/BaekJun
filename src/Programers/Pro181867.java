package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181867 {

    static int[] solution(String myString) {
        int[] answer = {};

        String[] splitArr = myString.split("x", -1);

        for (int i = 0; i < splitArr.length; i++) {

            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[i] = splitArr[i].length();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();
        System.out.println(Arrays.toString(solution(myString)));
    }
}
