package practice.codingbat.warm_up_2;

public class StringBits {

    /**
     * 
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo".
     * 
     * @param str
     * @return
     */
    public static String stringBits(String str) {

        String newStr = "";

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i = i + 2) {
            newStr += chars[i];
        }
        return newStr;

    }
}
