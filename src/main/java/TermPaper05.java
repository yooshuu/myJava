public class TermPaper05 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};

        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        System.out.printf(max + "입니다.");
    }
}
