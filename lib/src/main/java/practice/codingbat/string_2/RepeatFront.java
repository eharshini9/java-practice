package practice.codingbat.string_2;

public class RepeatFront {

    /**
     * 
     * Given a string and an int n, return a string made of the first n characters
     * of the string, followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     * 
     * @param str
     * @param n
     * @return
     */
    public static String repeatFront(String str, int n) {
        String finalStr = "";
        if (str.isEmpty() || n == 0) {
            return finalStr;
        }

        for (int i = n; i >= 0; i--) {

            finalStr = finalStr + str.substring(0, i);

        }

        return finalStr;
    }

}
