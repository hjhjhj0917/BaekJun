package Programers;

import java.util.*;


public class Pro120905 {

    static List<Integer> solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(numlist[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(solution(n, numlist));
    }
}
