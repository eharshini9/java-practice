package practice.codingbat.warm_up_2;

public class FrontTimes {

    /**
     * 
     * 
     * Given a string and a non-negative int n, we'll say that the front of the
     * string is the first 3 chars, or whatever is there if the string is less than
     * length 3. Return n copies of the front;
     * 
     * 
     * 
     * @param str
     * @param n
     * @return
     */
    public static String frontTimes(String str, int n) {

        String newStr = "";

        for (int i = 1; i <= n; i++) {

            newStr = str.length() < 3 ? newStr.concat(str) : newStr.concat(str.substring(0, 3));
        }
        return newStr;
    }

}
