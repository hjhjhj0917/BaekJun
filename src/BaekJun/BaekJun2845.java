package BaekJun;

import java.util.Scanner;

public class BaekJun2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        int people = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 0; i < 5; i++) {

            int cmpPeople = sc.nextInt();

            result.append(cmpPeople - (people * width) + " ");
        }

        System.out.println(result);
        sc.close();
    }
}
