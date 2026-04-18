public class Mid_test_02 {
    public static void main(String[] args) {
        // 웹 서버 로그 문자열
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0/\" 200";

        // URL은 "(큰따옴표) 안에 /(슬래시)로 시작함
        // 따라서 큰따옴표가 나오는 위치를 찾고,
        // 그 다음 위치부터 처음 나타나는 / 가 URL의 시작 위치가 됨
        int idx = log.indexOf("/", log.indexOf("\""));

        // URL은 공백이 나오기 전까지이므로
        // 위에서 찾은 시작위치(idx) 이후에 처음으로 등장하는 공백위치를 찾음
        int idxe = log.indexOf(" ", idx);

        // substring을 이용하여 idx부터 idxe전까지의 문자열을 잘라냄
        // "/apache_pb.gif" 부분만 추출됨
        String result = log.substring(idx, idxe);

        // 추출된 URL을 화면에 출력하여 확인
        System.out.println(result);
    }
}