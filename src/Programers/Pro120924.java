package Programers;

public class Pro120924 {

    public static int solution(int[] common) {

        if (common[1] - common[0] == common[2] - common[1]) {
            int d = common[1] - common[0];
            return common[common.length - 1] + d;
        } else {
            int r = common[1] / common[0];
            return common[common.length - 1] * r;
        }
    }

    public static void main(String[] args) {

        int[] common = {1, 2, 3, 4};

        System.out.println(solution(common));
    }
}
