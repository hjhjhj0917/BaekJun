package BaekJun;

import java.util.Scanner;

public class BaekJun23795 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int result = 0;

        while (true) {
            int money = sc.nextInt();

            if (money == -1) break;

            result += money;
        }
        System.out.println(result);
    }
}
