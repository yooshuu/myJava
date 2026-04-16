import java.util.Scanner;

public class Codetest0411_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("행운의 숫자: ");
        String num_s = s.next();
        int num = Integer.parseInt(num_s);

        System.out.print("금화의 무게: ");
        String weight_s = s.next();
        double weight = Double.parseDouble(weight_s);

        System.out.print("보유 포인트: ");
        int point = s.nextInt();

        System.out.printf("행운의 숫자 보상: %d \n", num*3);
        System.out.printf("금화 무게 보상: %.1f \n", weight*3);
        System.out.printf("최종 포인트 보상: %d \n", point*3);

        s.close();
    }
}