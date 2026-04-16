import java.util.Scanner;

public class Codetest0416_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("입력: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a+b<=c) {
            System.out.println("삼각형 아님");
        }
        else {
            if (a == b && b == c && c == a) {
                System.out.println("정삼각형");
            } else {
                if (a == b || b == c || c == a) {
                    System.out.print("이등변 ");
                } else {
                    System.out.print("일반 ");
                }

                if (a * a + b * b == c * c) {
                    System.out.println("직각삼각형");
                } else if (a * a + b * b > c * c) {
                    System.out.println("예각삼각형");
                } else if (a * a + b * b < c * c) {
                    System.out.println("둔각삼각형");
                }
            }
        }
    }
}