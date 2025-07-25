package BaekJun;

import java.util.Scanner;

public class BaekJun13496 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            int shipNum = sc.nextInt();
            int shipSpeed = sc.nextInt();
            int date = sc.nextInt();

            int res = 0;

            for (int j = 0; j < shipNum; j++) {

                int shipDistance = sc.nextInt();
                int shipPrice = sc.nextInt();

                if(shipSpeed * date >= shipDistance) {
                    res += shipPrice;
                }
            }

            sb.append("Data Set " + (i+1) +":\n" + res + "\n\n");
        }

        System.out.println(sb);
    }
}
