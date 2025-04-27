package exam;

public class Exam02 {
    public static void main(String[] args) {

        String log ="127.0.0.1 - frank [10/Oct/2000:12:55:36-0700] \"GET /apache.pb.gif HTTP/1.0\" 200";

        int idx1 = log.indexOf("\"");
        int idx2 = log.indexOf("/", idx1);
        int idx3 = log.indexOf(" ", idx2);
        String res = log.substring(idx2, idx3);

        System.out.println(res);
    }
}
