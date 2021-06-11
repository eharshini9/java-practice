package practice.common.utils;

public class StringUtils {

    private StringUtils() {
        // hiding constructor so that class cannot be instantiated.
    }

    /**
     * Repeats the given String n times.
     * 
     * @param str
     * @param times
     * @return repeated string
     */
    public static String repeat(String str, int times) {
        return repeat(str, times, 0, str.length());
    }

    /**
     * Repeats substring of given String n times
     * 
     * @param str
     * @param times
     * @param startIdx
     *            index for selecting start of substring
     * @param endIdx
     *            index for selecting end of substring, exclusive.
     * @return repeated substring
     */
    public static String repeat(String str, int times, int startIdx, int endIdx) {
        String s = str.subSequence(startIdx, endIdx)
                      .toString();
        String retval = "";
        for (int i = 1; i <= times; i++) {
            retval += s;
        }
        return retval;
    }

}
