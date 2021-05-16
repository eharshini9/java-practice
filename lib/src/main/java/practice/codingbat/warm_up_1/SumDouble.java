package practice.codingbat.warm_up_1;

public class SumDouble {

    /**
     * 
     * 
     * Given two int values, return their sum. Unless the two values are the same,
     * then return double their sum.
     * 
     * @param a
     * @param b
     * @return
     */
    public int sumDouble(int a, int b) {

        return (a == b) ? 2 * (a + b) : a + b;
    }

}
