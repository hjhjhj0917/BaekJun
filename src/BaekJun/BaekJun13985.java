package BaekJun;

import java.util.Scanner;

public class BaekJun13985 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int n1 = Integer.parseInt(line.split(" ")[0]);
        int n2 = Integer.parseInt(line.split(" ")[2]);
        int n3 = Integer.parseInt(line.split(" ")[4]);

        if (n1 + n2 == n3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
