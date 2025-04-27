package exam;

public class Exam03 {
    public static void main(String[] args) {

        int res = 0;

        for (int i = 100; i <= 300; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                res += i;
            }
        }
        System.out.println(res);
    }
}
