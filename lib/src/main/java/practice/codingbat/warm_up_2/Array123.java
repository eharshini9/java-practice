package practice.codingbat.warm_up_2;

public class Array123 {

    /**
     * 
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3
     * appears in the array somewhere.
     * 
     * @param nums
     * @return
     */
    public static boolean array123(int[] nums) {

        String newStr = "";

        for (int i : nums) {
            newStr += i;
        }

        if (newStr.contains("123")) {
            return true;
        }

        return false;
    }

}
