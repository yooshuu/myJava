import java.util.Scanner;

public class Prac260405_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요 : ");
        int kor = s.nextInt();

        System.out.print("영어 점수를 입력하세요 : ");
        int eng = s.nextInt();

        System.out.print("수학 점수를 입력하세요 : ");
        int math = s.nextInt();

        int total = kor + eng + math;
        double avg = (double)total / 3 ;

        System.out.printf("총점은 %d 입니다. \n", total);
        System.out.printf("평균은 %.2f 입니다.", avg);

        s.close();
    }
}
