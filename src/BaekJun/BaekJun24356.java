package BaekJun;

import java.io.*;
import java.util.StringTokenizer;

public class BaekJun24356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int startHour = Integer.parseInt(st.nextToken());
        int startMinute = Integer.parseInt(st.nextToken());
        int endHour = Integer.parseInt(st.nextToken());
        int endMinute = Integer.parseInt(st.nextToken());

        int start = startHour * 60 + startMinute;
        int end = endHour * 60 + endMinute;

        int totalTime = (end - start + 1440) % 1440;
        int totalLaps = totalTime / 30;

        bw.write(totalTime + " " + totalLaps + "");
        bw.flush();
        bw.close();
    }
}
