import java.util.Scanner;

public class Codetest0411_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("시: ");
        int hour = s.nextInt();

        System.out.print("분: ");
        int minute = s.nextInt();

        System.out.print("초: ");
        int sec = s.nextInt();

        System.out.print("영상 길이(초): ");
        int mv_sec = s.nextInt();

        long num = Math.round((hour*3600 + minute*60 + sec) / (double)mv_sec);
        System.out.print("시청 가능한 영상 개수: " + num);

        s.close();
    }
}
/* long num 인 이유는?
    Math.round(double)의 반환 타입은 long이기 때문에
 */

/*
            한 사용자가 온라인 강의를 듣고 있다.
            강의 영상은 하나당 일정한 길이(초)를 가지며,
            사용자는 하루 동안 공부에 사용한 총 시간을 이용해
            시청한 가능한 영상 개수를 계산하려고 한다.

            당신은 이 기능을 구현하는 개발자이다.
            주어진 학습 시간을 초로 변환한 뒤,
            시청 가능한 영상 개수를 계산하시오.

            단, 마지막 영상은 영상 길이의 50% 이상 시청했을 경우 1개로 인정한다.

            첫 입력: 총 공부 시간
            두번째 입력: 영상 시간

            -------------------

            입력 예시 1번
            시: 1
            분: 2
            초: 30
            영상 길이(초): 300

            출력 예시 1번
            시청 가능한 영상 개수: 13
         */