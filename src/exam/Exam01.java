package exam;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = i; j < num-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 2*(num-i); j <= num*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
