package Programers;

import java.util.Arrays;

public class Pro120824 {

    static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        answer[0] = count1;
        answer[1] = count2;
        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {1, 3, 7, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }
}
