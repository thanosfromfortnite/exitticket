public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 1, 3};
        System.out.println(haveThree(arr));

    }
    public static boolean haveThree(int[] nums) {
        int threes = 0;
        for (int i = 0; i < nums.length-1; i ++) {
            if (nums[i] == 3 && nums[i+1] == 3) {
                return false;
            }
            if (nums[i] == 3) {
                threes ++;
            }

        }
        if (nums[nums.length-1] == 3) {
            threes ++;
        }
        if (threes == 3) {
            return true;
        }
        else return false;
    }
}
