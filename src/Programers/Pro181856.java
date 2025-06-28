package Programers;

public class Pro181856 {

    static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int hap1 = 0, hap2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            hap1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            hap2 += arr2[i];
        }

        if (arr1.length == arr2.length) {
            if (hap1 > hap2) {
                answer = 1;
            } else if (hap1 < hap2) {
                answer = -1;
            }
        } else {
            if (arr1.length > arr2.length) {
                answer = 1;
            } else {
                answer = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};
        System.out.println(solution(arr1, arr2));
    }
}
