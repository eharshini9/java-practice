package practice.codingbat.warm_up_2;

public class ArrayFront9 {

    /**
     * 
     * Given an array of ints, return true if one of the first 4 elements in the
     * array is a 9. The array length may be less than 4.
     * 
     * @param nums
     * @return
     */
    public static boolean arrayFront9(int[] nums) {

        if (nums.length < 4) {
            for (int i = 0; i <= nums.length - 1; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        } else {

            for (int i = 0; i <= 3; i++) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
