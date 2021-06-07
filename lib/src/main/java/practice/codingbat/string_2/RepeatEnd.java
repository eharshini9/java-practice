package practice.codingbat.string_2;

public class RepeatEnd {

    /**
     * 
     * 
     * Given a string and an int n, return a string made of n repetitions of the
     * last n characters of the string. You may assume that n is between 0 and the
     * length of the string, inclusive.
     * 
     * @param str
     * @param n
     * @return
     */
    public String repeatEnd(String str, int n) {

        String finalStr = "";
        if (str.isEmpty()) {
            return finalStr;
        }

        for (int i = 1; i <= n; i++) {
            finalStr += str.substring(str.length() - n);

        }
        return finalStr;
    }

}
