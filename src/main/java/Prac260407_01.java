public class Prac260407_01 {
    public static void main(String[] args) {
        for (int i=1; i<=7; i++) {
            int count;

            if (i<=4) {
                count = i;
            } else {
                count = 8-i;
            }

            for (int j=1; j<=count; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
