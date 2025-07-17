package BaekJun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJun14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bigNum = br.readLine();
        int mod = 20000303;

        long result = 0;

        for (int i = 0; i < bigNum.length(); i++) {
            result = (result * 10 + (bigNum.charAt(i) - '0')) % mod;
        }

        System.out.println(result);
    }
}

