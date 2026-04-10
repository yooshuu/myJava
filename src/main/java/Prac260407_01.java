public class Prac260407_01 {
    public static void main(String[] args) {
        for (int i=1; i<=7; i++) {
            int cnt;

            if (i<=4) {
                cnt = i;
            } else {
                cnt = 8-i;
            }

            for (int j=1; j<=cnt; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}