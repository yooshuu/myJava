import java.util.Scanner;

public class Codetest0411_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("행운의 숫자: ");
        String num = s.next();
        int num2 = Integer.parseInt(num);

        System.out.print("금화의 무게: ");
        String weight = s.next();
        double weight2 = Double.parseDouble(weight);

        System.out.print("보유 포인트: ");
        int point = s.nextInt();

        System.out.println("행운의 숫자 보상: " + num2*3);
        System.out.printf("금화 무게 보상: %4.1f \n", weight2*3);
        System.out.println("최종 포인트 보상: " + point*3);

        s.close();
    }
}