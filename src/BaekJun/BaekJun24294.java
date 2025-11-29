package BaekJun;

import java.io.*;

public class BaekJun24294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int width1 = Integer.parseInt(br.readLine());
        int height1 = Integer.parseInt(br.readLine());
        int width2 = Integer.parseInt(br.readLine());
        int height2 = Integer.parseInt(br.readLine());

        int result = 2 * (height1 + height2) + 2 * Math.max(width1, width2) + 4;

        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}
