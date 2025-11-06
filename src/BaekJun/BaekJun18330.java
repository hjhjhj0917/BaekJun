package BaekJun;

import java.util.Scanner;

public class BaekJun18330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountUsed = sc.nextInt();
        int quota = sc.nextInt();

        if (quota + 60 < amountUsed) {
            System.out.println(((quota + 60) * 1500) + ((amountUsed - (quota + 60)) * 3000));
        } else {
            System.out.println(amountUsed * 1500);
        }
    }
}
