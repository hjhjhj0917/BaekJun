import java.util.Scanner;

public class BaekJun2941 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        int count = 0;

        while (true) {

            int lng = line.length();
            if (line.equals("c=")) {
                line = line.replace("c=", "");
                count++;
            }
            if (line.equals("c-")) {
                line = line.replace("c-", "");
                count++;
            }
            if (line.equals("dz=")) {
                line = line.replace("dz=", "");
                count++;
            }
            if (line.equals("d-")) {
                line = line.replace("d-", "");
                count++;
            }
            if (line.equals("lj")) {
                line = line.replace("lj", "");
                count++;
            }
            if (line.equals("nj")) {
                line = line.replace("nj", "");
                count++;
            }
            if (line.equals("s=")) {
                line = line.replace("s=", "");
                count++;
            }
            if (line.equals("z=")) {
                line = line.replace("z=", "");
                count++;
            }
            int lng2 = line.length();

            if (lng2 == lng) {
                break;
            }
        }
        System.out.println(line.length() + count);
    }
}
