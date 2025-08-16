package BaekJun;

import java.util.Scanner;

public class BaekJun14038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < 6; i++) {

            String res = sc.nextLine();

            if (res.equals("W")) {
                count++;
            }
        }

        if (count == 6 || count == 5) {
            System.out.println(1);
        } else if (count == 4 || count == 3) {
            System.out.println(2);
        } else if (count == 2 || count == 1) {
            System.out.println(3);
        } else {
            System.out.println(-1);
        }
    }
}
