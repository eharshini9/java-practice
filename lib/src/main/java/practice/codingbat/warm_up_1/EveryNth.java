package practice.codingbat.warm_up_1;

public class EveryNth {

    /**
     * 
     * 
     * Given a non-empty string and an int N, return the string made starting with
     * char 0, and then every Nth char of the string. So if N is 3, use char 0, 3,
     * 6, ... and so on. N is 1 or more.
     * 
     * @param str
     * @param n
     * @return
     */
    public static String everyNth(String str, int n) {

        char[] chars = str.toCharArray();

        String newStr = Character.toString(chars[0]);
        for (int i = 1; i < chars.length; i++) {

            if (i % n == 0) {
                newStr = newStr.concat(Character.toString(chars[i]));
            }
        }

        return newStr;

    }

}
