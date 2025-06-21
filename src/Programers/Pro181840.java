package Programers;

import java.util.Scanner;

public class Pro181840 {

    static int solution(int[] num_list, int n) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num_list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(solution(num_list, n));
    }
}
