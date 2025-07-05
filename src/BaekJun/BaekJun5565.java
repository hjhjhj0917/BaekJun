package BaekJun;

import java.util.Scanner;

public class BaekJun5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 9; i++) {

            int price = sc.nextInt();
            sum += price;
        }

        System.out.println(totalPrice - sum);
    }
}
