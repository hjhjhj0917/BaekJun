package BaekJun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJun13623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        String[] result = {"A", "B", "C"};
        List<Integer> one = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {

            num[i] = sc.nextInt();

            if (num[i] != 1 && num[i] != 0) return;
            if (num[i] == 1) one.add(i+1);
        }

        if (one.isEmpty() || one.size() == 3) {
            System.out.println("*");
        } else if (one.size() == 2) {
            System.out.println(result[5 - (one.get(0) + one.get(1))]);
        } else {
            System.out.println(result[one.get(0) - 1]);
        }
    }
}
