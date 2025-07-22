package BaekJun;

import java.util.Scanner;

public class BaekJun11549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tea = sc.nextInt();
        int result = 0;

        for (int i = 0; i < 5; i++) {

            int answer = sc.nextInt();

            if (answer == tea) result++;
        }

        System.out.println(result);
    }
}
