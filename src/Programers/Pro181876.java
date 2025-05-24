package Programers;

import java.util.Scanner;

public class Pro181876 {

    static String solution(String myString) {
        String answer = "";

        answer = myString.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myString = sc.nextLine();
        System.out.println(solution(myString));
    }
}
