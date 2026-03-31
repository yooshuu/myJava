public class review05_08 {
    public static void main(String[] args) {
        int hour = 14;

        if (hour >= 6 && hour <= 11) {
            System.out.println("오전");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("오후");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("저녁");
        } else {
            System.out.println("심야");
        }
    }
}
