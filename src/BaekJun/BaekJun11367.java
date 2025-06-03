package BaekJun;

import java.util.*;

public class BaekJun11367 {

    static class HobbitGrade {
        int startNum, endNum;
        String grade;

        HobbitGrade(int startNum, int endNum, String grade) {
            this.startNum = startNum;
            this.endNum = endNum;
            this.grade = grade;
        }
        boolean check(int hobbitScore) {
            return hobbitScore >= startNum && hobbitScore <= endNum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<HobbitGrade> hobbitGradeList = List.of(
                new HobbitGrade(97, 100, "A+"),
                new HobbitGrade(90, 96, "A"),
                new HobbitGrade(87, 89, "B+"),
                new HobbitGrade(80, 86, "B"),
                new HobbitGrade(77, 79, "C+"),
                new HobbitGrade(70, 76, "C"),
                new HobbitGrade(67, 69, "D+"),
                new HobbitGrade(97, 100, "D"),
                new HobbitGrade(0, 59, "F")
        );

        int subjectNum = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sc.nextLine();

        for (int i = 0; i < subjectNum; i++) {
            String hobbit = sc.nextLine();
            String hobbitName = hobbit.split(" ")[0];
            int hobbitScore = Integer.parseInt(hobbit.split(" ")[1]);

            for (HobbitGrade hobbitGrade : hobbitGradeList) {
                if (hobbitGrade.check(hobbitScore)) {
                    sb.append(hobbitName + " " + hobbitGrade.grade + "\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
