package practice.condigbat.string_1;

public class DeFront {

    /**
     * 
     * 
     * Given a string, return a version without the first 2 chars. Except keep the
     * first char if it is 'a' and keep the second char if it is 'b'. The string may
     * be any length. Harder than it looks.
     * 
     * @param str
     * @return
     */
    public static String deFront(String str) {
        if (str.length() >= 2) {
            if (str.startsWith("ab")) {
                return str;
            }
            if (str.charAt(1) == 'b') {
                return str.substring(1);
            }
            if (str.charAt(0) == 'a') {
                return str.substring(0, 1) + str.substring(2);
            }
            return str.substring(2);
        }

        return str.length() > 0 && str.equals("a") ? str : "";

    }

}
