package BaekJun;

import java.util.Scanner;

public class BaekJun17598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countTiger = 0;
        int countLion = 0;

        for (int i = 0; i < 9; i++) {
            String vote = sc.nextLine();

            if (vote.equals("Tiger")) {
                countTiger++;
            } else if (vote.equals("Lion")) {
                countLion++;
            }
        }

        if (countTiger > countLion && countTiger >= 5) {
            System.out.println("Tiger");
        } else if (countLion > countTiger && countLion >= 5) {
            System.out.println("Lion");
        }
    }
}
