package BaekJun;

import java.util.Scanner;

public class BaekJun27866 {

    // 단어 s와 정수 i가 주어졌을 때, s의 i번째 글자를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int su = sc.nextInt();

        String[] line = str.split("");

        System.out.println(line[su-1]);

    }
}
