package practice.codingbat.warm_up_1;

public class Front3 {

    /**
     * 
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there. Return a
     * new string which is 3 copies of the front.
     * 
     * 
     * @param str
     * @return
     */
    public static String front3(String str) {
        if (str.length() < 3) {
            return (str.concat(str)).concat(str);
        }

        return (str.substring(0, 3)
                   .concat(str.substring(0, 3))).concat(str.substring(0, 3));

    }

}
