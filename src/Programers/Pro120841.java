package Programers;

import java.util.Scanner;

public class Pro120841 {

    static int solution(int[] dot) {
        int answer = 0;

        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] dot= {1, 2};

        System.out.println(solution(dot));
    }
}
