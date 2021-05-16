package practice.codingbat.warm_up_1;

public class PosNeg {

    /**
     * 
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are
     * negative.
     * 
     * 
     * @param a
     * @param b
     * @param negative
     * @return
     */
    public boolean posNeg(int a, int b, boolean negative) {

        return (negative && a < 0 && b < 0) || (!negative && ((a < 0 && b > 0) || (a > 0 && b < 0)));
    }

}
