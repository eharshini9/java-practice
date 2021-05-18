package practice.codingbat.warm_up_1;

public class Front22 {

    /**
     * 
     * Given a string, take the first 2 chars and return the string with the 2 chars
     * added at both the front and back, so "kitten" yields"kikittenki". If the
     * string length is less than 2, use whatever chars are there.
     * 
     * 
     * @param str
     * @return
     */
    public static String front22(String str) {

        if (str.length() < 2) {
            return (str.concat(str)).concat(str);
        }

        return (str.substring(0, 2)
                   .concat(str)).concat(str.substring(0, 2));
    }

}
