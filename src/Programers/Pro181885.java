package Programers;

import java.util.Arrays;

public class Pro181885 {

    static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length - 1] = todo_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(Arrays.toString(solution(todo_list, finished)));

    }
}
