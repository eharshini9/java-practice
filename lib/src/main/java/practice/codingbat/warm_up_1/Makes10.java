package practice.codingbat.warm_up_1;

public class Makes10 {

    /**
     * 
     * Given 2 ints, a and b, return true if one if them is 10 or if their sum is
     * 10.
     * 
     * 
     * @param a
     * @param b
     * @return
     */
    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

}
