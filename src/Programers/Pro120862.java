package Programers;

public class Pro120862 {

    static int solution(int[] numbers) {
        int answer = 0;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int maxM1 = Integer.MAX_VALUE;
        int maxM2 = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max1 = numbers[i];
                index1 = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max2 && index1 != i) {
                max2 = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < maxM1) {
                maxM1 = numbers[i];
                index2 = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < maxM2 && index2 != i) {
                maxM2 = numbers[i];
            }
        }
        if (max1 * max2 >= maxM1 * maxM2) {
            answer = max1 * max2;
        } else {
            answer = maxM1 * maxM2;
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] numbers = {0, -31, 24, 10, 1, 9};
        System.out.println(solution(numbers));
    }
}
