package practice.codingbat.warm_up_1;

public class EndUp {

    /**
     * 
     * 
     * Given a string, return a new string where the last 3 chars are now in upper
     * case. If the string has less than 3 chars, uppercase whatever is there. Note
     * that str.toUpperCase() returns the uppercase version of a string.
     * 
     * 
     * @param str
     * @return
     */
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        return str.substring(0, str.length() - 3)
                  .concat(str.substring(str.length() - 3)
                             .toUpperCase());
    }

}
