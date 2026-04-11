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

        /*double num = Math.round((hour*3600 + minute*60 + sec) / (double)mv_sec);
        System.out.printf("시청 가능한 영상 개수: %4.1f" , num);*/

        long num = Math.round((hour*3600 + minute*60 + sec) / (double)mv_sec);
        System.out.print("시청 가능한 영상 개수: " + num);

        s.close();
    }
}
