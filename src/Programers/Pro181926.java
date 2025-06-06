package Programers;

import java.util.Scanner;

public class Pro181926 {

    static int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {

            if (control.charAt(i) == 'w') {
                answer += 1;
            } else if (control.charAt(i) == 's') {
                answer -= 1;
            } else if (control.charAt(i) == 'd') {
                answer += 10;
            } else if (control.charAt(i) == 'a') {
                answer -= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String control = sc.next();
        System.out.println(solution(n, control));
    }
}
