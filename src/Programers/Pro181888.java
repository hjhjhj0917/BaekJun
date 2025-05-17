package Programers;

import java.util.Arrays;
import java.util.Scanner;

public class Pro181888 {

    static int[] solution(int[] num_list, int n) {
        int[] answer = new int[1 + (num_list.length - 1) / n];
        answer[0] = num_list[0];
        int count = 0;

        for (int i = 0; i < num_list.length; i += n) {
                answer[count++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = sc.nextInt();
        System.out.println(Arrays.toString(solution(num_list, n)));
    }
}
