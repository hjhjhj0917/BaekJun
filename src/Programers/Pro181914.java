package Programers;

import java.math.BigInteger;
import java.util.Scanner;

public class Pro181914 {

    static int solution(String number) {
        int answer = 0;

        BigInteger num = new BigInteger(number);

        answer = num.mod(BigInteger.valueOf(9)).intValue();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number = sc.nextLine();
        System.out.println(solution(number));
    }
}
