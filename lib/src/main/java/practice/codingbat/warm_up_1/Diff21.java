package practice.codingbat.warm_up_1;

public class Diff21 {

    /**
     * 
     * 
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21.
     * 
     * 
     * @param n
     * @return
     */
    public int diff21(int n) {

        return (n > 21) ? 2 * (n - 21) : 21 - n;

    }

}
