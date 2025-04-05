import java.util.Scanner;

public class BaekJun1463 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while (num > 1) {

            if (num % 3 != 0) {
                num -= 1;
            } else {
                num /= 3;
                if (num % 2 == 0) {
                    num /= 2;
                }
            }
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}
