package BaekJun;

import java.util.Scanner;

public class BaekJun18698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int cnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cnt; i++) {

            String line = sc.nextLine();
            int step = 0;

            for (int j = 0; j < line.length(); j++) {

                if (line.charAt(j) == 'U') {
                    step++;
                } else {
                    break;
                }
            }
            sb.append(step + "\n");
        }

        System.out.println(sb);
    }
}
