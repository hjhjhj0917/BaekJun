package Programers;

public class Pro181879 {

    static int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = num_list[0];
            for (int i = 1; i < num_list.length; i++) {
                answer *= num_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {2, 3, 4, 5};
        System.out.println(solution(num_list));
    }
}
