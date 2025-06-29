package BaekJun;

import java.util.Scanner;

public class BaekJun2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        while (sc.hasNext()) {
            String line = sc.nextLine();

            String name = line.split(" ")[0];
            int age = Integer.parseInt(line.split(" ")[1]);
            int weight = Integer.parseInt(line.split(" ")[2]);

            if (line.equals("# 0 0")) break;

            if (age > 17 || weight >= 80) {

                result.append(name + " Senior" + "\n");
            } else {

                result.append(name + " Junior" + "\n");
            }
        }

        System.out.println(result);
        sc.close();
    }
}
