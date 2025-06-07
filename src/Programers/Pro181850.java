package Programers;

import java.util.Scanner;

public class Pro181850 {

    static int solution(double flo) {
        int answer = 0;

        answer = (int) Math.floor(flo);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double flo = sc.nextDouble();
        System.out.println(solution(flo));
    }
}
