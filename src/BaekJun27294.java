import java.util.Scanner;

public class BaekJun27294 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int drink = sc.nextInt();

        if (time <= 16 && time >= 12 && drink == 0) {
            System.out.println(320);
        } else if (time <= 16 && time >= 12 && drink == 1) {
            System.out.println(280);
        } else {
            System.out.println(280);
        }
    }
}
