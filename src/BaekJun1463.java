import java.util.Scanner;

public class BaekJun1463 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while (num > 1) {

            if (num % 3 == 1) {
                num -= 1;
            } else {
                if (num % 3 == 0) {
                    num /= 3;
                } else if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num -= 1;
                }
            }
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
