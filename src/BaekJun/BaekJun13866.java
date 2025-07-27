package BaekJun;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJun13866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[4];

        for (int i = 0; i < nums.length; i++) {

            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        int sum1 = nums[0] + nums[3];
        int sum2 = nums[1] + nums[2];

        System.out.println(Math.abs(sum1 - sum2));
    }
}
