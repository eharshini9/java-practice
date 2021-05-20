package practice.codingbat.warm_up_2;

public class StringTimes {

    /**
     * 
     * Given a string and a non-negative int n, return a larger string that is n
     * copies of the original string.
     * 
     * @param str
     * @param n
     * @return
     */
    public static String stringTimes(String str, int n) {

        String newStr = "";

        for (int i = 1; i <= n; i++) {
            newStr = newStr.concat(str);
        }
        return newStr;
    }

}
