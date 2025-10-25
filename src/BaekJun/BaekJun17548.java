package BaekJun;

import java.util.Scanner;

public class BaekJun17548 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String answer = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e') {
                answer += String.valueOf(text.charAt(i)).repeat(2);
            } else {
                answer += text.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
