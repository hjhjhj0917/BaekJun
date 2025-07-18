package BaekJun;

import java.util.Scanner;

public class BaekJun6784 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;
        String[] corrects = new String[num];
        sc.nextLine();

        for (int i = 0; i < num; i++) {

            corrects[i] = sc.nextLine();
        }

        for (int i = 0; i < num; i++) {

            String answer = sc.nextLine();

            if (corrects[i].equals(answer)) count++;
        }

        System.out.println(count);
    }
}
