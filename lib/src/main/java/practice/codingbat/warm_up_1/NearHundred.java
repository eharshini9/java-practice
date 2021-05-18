package practice.codingbat.warm_up_1;

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
    public static boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;

    }

}
