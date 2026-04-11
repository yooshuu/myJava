import java.util.Scanner;

public class Codetest0411_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("주민번호 입력: ");
        String num = s.nextLine();

        num.indexOf("-");

        System.out.println("앞자리: " + num.substring(0, num.indexOf("-")));
        System.out.println("뒷자리: " + num.substring(num.indexOf("-")+1, num.length()));
        System.out.println("성별코드: " + num.substring(num.indexOf("-")+1,8));

        s.close();
    }
}
