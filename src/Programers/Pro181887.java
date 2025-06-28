package Programers;

public class Pro181887 {

    static int solution(int[] num_list) {
        int answer = 0;
        int hap1 = 0, hap2 = 0;

        for (int i = 0; i < num_list.length; i+=2) { hap1 += num_list[i]; }
        for (int i = 1; i < num_list.length; i+=2) { hap2 += num_list[i]; }

        if (hap1 >= hap2) {
            answer = hap1;
        } else {
            answer = hap2;
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] num_list = {4, 2, 6, 1, 7, 6};
        System.out.println(solution(num_list));
    }
}
