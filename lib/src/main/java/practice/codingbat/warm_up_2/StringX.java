package practice.codingbat.warm_up_2;

public class StringX {

    /**
     * 
     * Given a string, return a version where all the "x" have been removed. Except
     * an "x" at the very start or end should not be removed.
     * 
     * 
     * 
     * @param str
     * @return
     */
    public static String stringX(String str) {
        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i <= chars.length - 1; i++) {
            if (i == 0 || i == chars.length - 1 || chars[i] != 'x') {
                newStr += chars[i];
            }
        }
        return newStr;
    }
}
