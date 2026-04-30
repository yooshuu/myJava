public class Mid_test_02 { // Exam02 클래스 선언.
    public static void main(String[] args) { // 프로그램의 시작점인 main 메서드

        // 로그 변수 선언
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700] \"GET /apache_pb.gif HTTP/1.0/\" 200";

        // log.indexOf("\"")) : 제일 처음으로 나오는 큰따옴표(")의 위치를 찾음
        // log.indexOf("/", ...) : 큰 따옴표 이후로 처음 나오는 슬래시(/)의 위치를 찾음
        // 그다음 URL 시작 '/' 위치를 idx에 저장
        int idx = log.indexOf("/", log.indexOf("\""));

        // log.indexOf(" ", idx) : idx 이후로 나오는 첫 공백의 위치를 찾음
        // log.substring(...) : idx(시작위치)부터 다음 공백이 나오기 전까지 추출
        // 따라서 /apahce_pb.gif 가 추출되고 res에 저장
        String res = log.substring(idx, log.indexOf(" ", idx));

        // 추출한 URL 출력
        System.out.println(res);
    }
}