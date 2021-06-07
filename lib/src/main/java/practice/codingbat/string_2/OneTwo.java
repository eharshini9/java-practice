package practice.codingbat.string_2;

public class OneTwo {

    /**
     * 
     * Given a string, compute a new string by moving the first char to come after
     * the next two chars, so "abc" yields "bca". Repeat this process for each
     * subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
     * fewer than 3 chars at the end.
     * 
     * @param str
     * @return
     */
    public String oneTwo(String str) {

        String finalStr = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 2; i = i + 3) {

            finalStr = finalStr + chars[i + 1] + chars[i + 2] + chars[i];

        }

        return finalStr;

    }

}
