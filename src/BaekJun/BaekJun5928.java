package BaekJun;

import java.util.Scanner;

public class BaekJun5928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int hour = sc.nextInt();
        int min = sc.nextInt();

        int start = 11*24*60 + 11*60 + 11;
        int cmp = day*24*60 + hour*60 + min;

        System.out.println(cmp - start);
    }
}
