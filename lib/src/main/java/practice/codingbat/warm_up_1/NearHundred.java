package practice.codingbat.warm_up_1;

import java.util.ArrayList;
import java.util.List;

public class NearHundred {

    /**
     * 
     * 
     * Given an int n, return true if it is within 10 of 100 or 200. Note:
     * Math.abs(num) computes the absolute value of a number.
     * 
     * 
     * @param n
     * @return
     */
    public boolean nearHundred(int n) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 90; i <= 110; i++) {
            nums.add(i);
        }
        for (int j = 190; j <= 210; j++) {
            nums.add(j);
        }

        return nums.contains(n);

    }

}
