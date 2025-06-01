package Programers;

import java.util.Scanner;

public class Pro181898 {

    static int solution(int[] arr, int idx) {
        int answer = 0;

        for (int i = idx; i < arr.length; i++) {

            if (arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0, 0, 0, 1};
        int idx = sc.nextInt();
        System.out.println(solution(arr, idx));
    }
}
