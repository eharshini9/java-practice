package practice.codingbat.warm_up_2;

public class ArrayCount9 {

    /**
     * 
     * Given an array of ints, return the number of 9's in the array.
     * 
     * @param nums
     * @return
     */
    public static int arrayCount9(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

}
