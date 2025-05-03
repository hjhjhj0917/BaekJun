package BaekJun;

import java.util.Scanner;

public class BaekJun11720 {

    // N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hap = 0;
        int su = sc.nextInt();
        int[] arr = new int[su];

        sc.nextLine();
        String str = sc.nextLine();
        String[] line = str.split("");


        for (int i = 0; i < su; i++) {

            arr[i] = Integer.parseInt(line[i]);
            hap = hap + arr[i];
        }
        System.out.println(hap);
    }
}
