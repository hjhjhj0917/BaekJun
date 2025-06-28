package Programers;

import java.util.Arrays;

public class Pro181852 {
    static int[] solution(int[] num_list) {
        int[] answer = {};

        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) {

            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length - 1] = num_list[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
