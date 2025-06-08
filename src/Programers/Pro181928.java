package Programers;

public class Pro181928 {

    static int solution(int[] num_list) {
        int answer = 0;

        String num1 = "";
        String num2 = "";

        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] % 2 == 0) {
                num1 += num_list[i];
            } else {
                num2 += num_list[i];
            }
        }

        answer = Integer.parseInt(num1) + Integer.parseInt(num2);

        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
