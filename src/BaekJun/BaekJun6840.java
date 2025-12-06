package BaekJun;

import java.io.*;
import java.util.Arrays;

public class BaekJun6840 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {

            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        bw.write(num[1] + "");
        bw.flush();
        bw.close();
    }
}
