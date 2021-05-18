package practice.codingbat.warm_up_1;

public class FrontBack {

    /**
     * 
     * Given a string, return a new string where the first and last chars have been
     * exchanged.
     * 
     * @param str
     * @return
     */
    public static String frontBack(String str) {

        char[] chars = new char[str.length()];

        str.getChars(0, str.length(), chars, 0);

        String newStr = "";

        if (!str.isEmpty()) {
            newStr = Character.toString(chars[str.length() - 1]);

            for (int i = 1; i < str.length() - 1; i++) {
                newStr = newStr.concat(Character.toString(chars[i]));
            }

            if (str.length() > 1) {
                newStr = newStr.concat(Character.toString(chars[0]));
            }
        }
        return newStr;
    }

    public static String frontBack1(String str) {

        String newStr = "";

        if (!str.isEmpty()) {
            newStr = str.substring(str.length() - 1);

            if (str.length() > 1) {
                newStr = (newStr.concat(str.substring(1, str.length() - 1))).concat(str.substring(0, 1));
            }
        }
        return newStr;
    }
}
