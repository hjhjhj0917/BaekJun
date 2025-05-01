import java.util.Scanner;

public class BaekJun27433 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int res = 1;

        if (num == 0) {
            System.out.println(res);
        } else {
            for (int i = 0; i < num; i++) {
                res *= num - i;
            }
            System.out.println(res);
        }
    }
}
