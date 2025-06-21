package Programers;

import java.util.Arrays;

public class Pro181853 {

    static int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);

        for (int i = 0; i < 5; i++) {

            answer = Arrays.copyOf(answer, answer.length+1);
            answer[answer.length - 1] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = { 12, 4, 15, 46, 38, 1, 14 };
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
