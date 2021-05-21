package practice.condigbat.string_1;

public class ComboString {

    /**
     * 
     * 
     * Given 2 strings, a and b, return a string of the form short+long+short, with
     * the shorter string on the outside and the longer string on the inside. The
     * strings will not be the same length, but they may be empty (length 0).
     * 
     * 
     * 
     * @param a
     * @param b
     * @return
     */
    public static String comboString(String a, String b) {

        int maxLength = Math.max(a.length(), b.length());

        if (maxLength == 0) {
            return "";
        }

        return (a.length() == maxLength) ? b + a + b : a + b + a;

    }

}
