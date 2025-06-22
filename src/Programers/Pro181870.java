package Programers;

import java.util.Arrays;

public class Pro181870 {

    static String[] solution(String[] strArr) {
        String[] answer = {};

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {

                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = strArr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] strArr = { "there","are","no","a","ds" };
        System.out.println(Arrays.toString(solution(strArr)));
    }
}
