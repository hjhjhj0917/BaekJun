package BaekJun;

import java.io.*;
import java.util.List;

public class BaekJun24196 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String password = br.readLine();
        String result = "";

        int index = 0;

        List<Character> list = List.of(
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z'
        );

        while (true) {

            if (index > password.length() - 1) {
                result += password.charAt(password.length() - 1);
                break;
            }

            result += password.charAt(index);

            if (index == password.length() - 1) break;

            index += list.indexOf(password.charAt(index)) + 1;
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
