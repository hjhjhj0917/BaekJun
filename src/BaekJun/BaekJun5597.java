package BaekJun;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJun5597 {

    // 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        HashSet<Integer> num = new HashSet<>();

        for(int i = 0; i < 28 ; i++){

            int su = sc.nextInt();
            num.add(su);
        }
        for(int i = 1 ; i <= 30 ; i++){

            if(num.contains(i)){
            } else {
                System.out.println(i);
            }
        }
    }
}
