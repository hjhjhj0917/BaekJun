package BaekJun;

import java.util.Scanner;

public class BaekJun3765 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();

        while (sc.hasNext()) {
            String equation = sc.nextLine();

            if (equation.isEmpty()) break;

            result.append(equation + "\n");
        }

        System.out.println(result);
    }
}
