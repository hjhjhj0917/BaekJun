package BaekJun;

import java.util.Scanner;

public class BaekJun1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        String vowels = "aeiouAEIOU";

        while (sc.hasNext()) {

            String line = sc.nextLine();
            int count = 0;

            if (line.equals("#")) break;

            for (int i = 0; i < line.length(); i++) {
                if (vowels.contains(Character.toString(line.charAt(i)))) {

                    count++;
                }
            }

            result.append(count + "\n");
        }

        System.out.println(result);
    }
}
