package exam1;

public class OverloadMain {

    static int calculator(int num1, int num2) {
        return num1 + num2;
    }

    static int calculator(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        System.out.println(calculator(num1, num2));
        System.out.println(calculator(num1, num2, num3));
    }
}
