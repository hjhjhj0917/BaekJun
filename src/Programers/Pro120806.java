package Programers;

import java.util.Scanner;

public class Pro120806 {
    public static int solution(int num1, int num2) {

        double n1 = Double.parseDouble(String.valueOf(num1));
        double n2 = Double.parseDouble(String.valueOf(num2));

        int answer = (int) ((n1 / n2) * 1000);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(num1, num2));
    }
}
