package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181891 {

    static int[] solution(int[] num_list, int n) {
        int[] answer = {};

        for (int i = n; i < num_list.length; i++) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {2,1,6};
        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
