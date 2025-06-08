package Programers;

import java.util.Scanner;

public class Pro120904 {

    static int solution(int num, int k) {
        int answer = -1;

        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == String.valueOf(k).charAt(0)) {
                answer = i+1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(num, k));
    }
}
