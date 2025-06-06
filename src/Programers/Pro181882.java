package Programers;

import java.util.Arrays;

public class Pro181882 {

    static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i]/2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                answer[i] = arr[i]*2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
