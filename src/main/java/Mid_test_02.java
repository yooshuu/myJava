public class Mid_test_02 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0/\" 200";

        int idx = log.indexOf("/", log.indexOf("\""));

        String res = log.substring(idx, log.indexOf(" ", idx));

        System.out.println(res);
    }
}