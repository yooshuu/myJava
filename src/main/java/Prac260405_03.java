import java.util.Scanner;

public class Prac260405_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("단을 입력하세요 : ");
        int dan = s.nextInt();
        int i;

        for (i=1 ; i<=9 ; i++) {
            System.out.printf("%d x %d = %d \n", dan, i, dan*i);
        }

        s.close();
    }
}
