package Programers;

import java.util.Arrays;

public class Pro181886 {

    static String[] solution(String[] names) {
        String[] answer = {};

        for (int i = 0; i < names.length; i+=5) {
            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length-1] = names[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(Arrays.toString(solution(names)));
    }
}
