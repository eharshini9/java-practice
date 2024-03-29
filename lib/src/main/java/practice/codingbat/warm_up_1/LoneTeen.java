package practice.codingbat.warm_up_1;

public class LoneTeen {

    /**
     * 
     * 
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     * 
     * @param a
     * @param b
     * @return
     */
    public static boolean loneTeen(int a, int b) {

        return ((a >= 13 && a <= 19) && !(b >= 13 && b <= 19)) || (!(a >= 13 && a <= 19) && (b >= 13 && b <= 19));

    }

}
