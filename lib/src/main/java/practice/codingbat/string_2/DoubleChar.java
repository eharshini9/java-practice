package practice.codingbat.string_2;

public class DoubleChar {

    public static String doubleChar(String str) {

        char[] chars = str.toCharArray();

        String newStr = "";

        for (int i = 0; i < chars.length; i++) {

            newStr = newStr + chars[i] + chars[i];
        }

        // sol2:
        /*
         * for (int i = 0; i < str.length(); i++) { newStr = newStr + str.charAt(i) +
         * str.charAt(i); }
         */

        return newStr;
    }

}
