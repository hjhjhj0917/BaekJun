package BaekJun;

import java.util.Scanner;

public class BaekJun21875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();
        String end = sc.nextLine();

        int n1 = 0;
        int n2 = 0;

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < alphabet.length; i++) {

            if (start.charAt(0) == alphabet[i].charAt(0)) n1 = i + 1;
            if (end.charAt(0) == alphabet[i].charAt(0)) n2 = i + 1;
        }

        if (Math.abs(n1 - n2) > Math.abs(start.charAt(1) - end.charAt(1))) {
            System.out.println(Math.abs(start.charAt(1) - end.charAt(1)) + " " + Math.abs(n1 - n2));
        } else {
            System.out.println(Math.abs(n1 - n2) + " " + Math.abs(start.charAt(1) - end.charAt(1)));
        }
    }
}
