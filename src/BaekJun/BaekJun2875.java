package BaekJun;

import java.util.Scanner;

public class BaekJun2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int womanNum = sc.nextInt();
        int manNum = sc.nextInt();
        int participationNum = sc.nextInt();
        int result = 0;

        int totalNum = Math.min(womanNum / 2, manNum);
        int totalRemain = (womanNum - (totalNum * 2)) + (manNum - totalNum);

        if (totalRemain < participationNum){
            result = totalNum - ((participationNum - totalRemain)+ 2) / 3;
        } else {
            result = totalNum;
        }

        System.out.println(result);

    }
}
