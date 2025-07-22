package BaekJun;

import java.util.Scanner;

public class BaekJun11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNext()) {

            String sentence = sc.nextLine();

            if (sentence.equals("END")) break;

            for (int i = sentence.length()-1; i >= 0; i--) {

                sb.append(sentence.charAt(i));
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
