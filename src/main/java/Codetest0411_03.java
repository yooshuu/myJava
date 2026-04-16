import java.util.Scanner;

public class Codetest0411_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("주민번호 입력: ");
        String num = s.nextLine();

        int idx = num.indexOf("-");

        System.out.println("앞자리: " + num.substring(0, idx));
        System.out.println("뒷자리: " + num.substring(idx+1, num.length()));
        System.out.println("성별코드: " + num.charAt(idx+1));

        s.close();
    }
}

/*
            한 사용자가 회원가입을 진행하고 있다.
            시스템은 입력된 주민등록번호에서 생년월일과 성별 정보를 자동으로 추출하려고 한다.

            당신은 이 기능을 구현하는 개발자이다.
            주민등록번호를 입력받아 앞자리와 뒷자리를 분리하고, 성별 코드를 추출하시오.

            -------------------

            입력 예시 1번
            주민번호 입력: 990101-1234567

            출력 예시 1번
            앞자리: 990101
            뒷자리: 1234567
            성별코드: 1
         */
