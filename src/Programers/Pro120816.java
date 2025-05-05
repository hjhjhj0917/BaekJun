package Programers;

import java.util.Scanner;

public class Pro120816 {

    static int solution(int slice, int n) {
        int answer = 0;

         if (slice >= n) {
             answer = 1;
         } else {
             if (n % slice == 0) {
                 answer = n / slice;
             } else {
                 answer = n / slice + 1;
             }
         }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int slice = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(solution(slice, n));
    }
}
