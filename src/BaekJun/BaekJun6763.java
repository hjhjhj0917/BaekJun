package BaekJun;

import java.util.Scanner;

public class BaekJun6763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speedLimit = sc.nextInt();
        int speed = sc.nextInt();
        int overSpeed = speed - speedLimit;

        if (speedLimit >= speed) {

            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            if (overSpeed >= 1 && overSpeed <= 20) {

                System.out.println("You are speeding and your fine is $100.");
            } else if (overSpeed >= 21 && overSpeed <= 30) {

                System.out.println("You are speeding and your fine is $270.");
            } else {

                System.out.println("You are speeding and your fine is $500.");
            }
        }
    }
}
