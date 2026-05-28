package termpaper;

import java.util.ArrayList;
import java.util.List;

public class TermPaper07 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("2세대 반복문");
        for(Integer num : list) {
            System.out.println(num);
        }

        System.out.println("3세대 반복문");
        list.forEach(num -> System.out.println(num));
    }
}
