package BaekJun;

import java.util.Scanner;

public class BaekJun1292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startNum = sc.nextInt();
        int endNum = sc.nextInt();
        int cnt = 0;
        int result = 0;

        for (int i = 1; i <= endNum; i++) {
            for (int j = 0; j < i; j++) {

                cnt += 1;

                if (cnt >= startNum && cnt <= endNum) result += i;
            }
        }

        System.out.println(result);
    }
}
