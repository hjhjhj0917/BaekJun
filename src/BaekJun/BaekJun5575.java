package BaekJun;

import java.util.Scanner;

public class BaekJun5575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {

            int hour = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            int eHour = sc.nextInt();
            int eMin = sc.nextInt();
            int eSec = sc.nextInt();

            int go = hour*60*60 + min*60 + sec;
            int leave = eHour*60*60 + eMin*60 + eSec;
            int result = leave - go;

            sb.append(result/60/60 + " " + result/60%60 + " " + result%60 + "\n");
        }

        System.out.println(sb);
    }
}
