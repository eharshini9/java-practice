package practice.codingbat.warm_up_1;

public class Max1020 {

    /**
     * 
     * 
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     * 
     * 
     * 
     * 
     * @param a
     * @param b
     * @return
     */
    public static int max1020(int a, int b) {

        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return Math.max(a, b);
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }

        return 0;

    }

}
