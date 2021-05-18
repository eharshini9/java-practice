package practice.codingbat.warm_up_1;

public class NotString {

    /**
     * 
     * 
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string
     * unchanged. Note: use .equals() to compare 2 strings.
     * 
     * 
     * @param str
     * @return
     */
    public static String notString(String str) {

        return str.startsWith("not") ? str : "not " + str;

    }

}
