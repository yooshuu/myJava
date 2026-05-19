package termpaper;

public class TermPaper04 {
    public static void main(String[] args) {
        int cnt;

        for(int i=1; i<=7; i++) {
            if (i<=4) {
                cnt = i;
            } else {
                cnt = 8-i;
            }

            for(int j=0; j<cnt; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
