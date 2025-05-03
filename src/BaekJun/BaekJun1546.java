package BaekJun;

import java.util.Scanner;

public class BaekJun1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        double result = 0;
        int su = sc.nextInt();
        int[] avr = new int[su];
        sc.nextLine();

        String line = sc.nextLine();
        String[] str = line.split(" ");

        for(int i = 0 ; i < su ; i++){

            avr[i] = Integer.parseInt(str[i]);

            if(avr[i] >= max){
                max = avr[i];
            }
        }
        for(int i = 0 ; i < su ; i++){

            result = result + (((double) avr[i] / max) * 100);
        }
        System.out.println(result / su);

    }
}
