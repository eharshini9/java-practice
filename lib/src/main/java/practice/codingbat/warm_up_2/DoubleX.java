package practice.codingbat.warm_up_2;

public class DoubleX {

    /**
     * 
     * 
     * Given a string, return true if the first instance of "x" in the string is
     * immediately followed by another "x".
     * 
     * xx true
     * 
     * @param str
     * @return
     */
    static boolean doubleX(String str) {

        char[] chars = str.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == 'x') {
                count++;

                if (chars[i + 1] == 'x' && count == 1) {

                    return true;
                }
            }
        }
        return false;
    }

}
