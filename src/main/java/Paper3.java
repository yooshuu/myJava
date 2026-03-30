import java.util.Scanner;

public class Paper3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = s.nextLine();

        String result = (a + b).toLowerCase().replaceAll(" ", "");

        System.out.println(result);

        s.close();
    }
}
