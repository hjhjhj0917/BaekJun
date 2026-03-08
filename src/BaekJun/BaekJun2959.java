package BaekJun;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJun2959 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] len = new int[4];

        for(int i = 0; i < len.length; i++) {

            len[i] = sc.nextInt();
        }

        Arrays.sort(len);

        System.out.println(Math.min(len[0], len[1]) * Math.min(len[2], len[3]));
    }
}
