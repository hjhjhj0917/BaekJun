package Programers;

import java.util.Scanner;

public class Pro120849 {

    static String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < vowels.length; i++) {
            my_string = my_string.replaceAll(vowels[i], "");
        }
        answer = my_string;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.nextLine();
        System.out.println(solution(my_string));
    }
}
