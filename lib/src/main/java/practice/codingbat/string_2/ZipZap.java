package practice.codingbat.string_2;

public class ZipZap {

    /**
     * 
     * 
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting
     * with 'z' and ending with 'p'. Return a string where for all such words, the
     * middle letter is gone, so "zipXzap" yields "zpXzp".
     * 
     * @param str
     * @return
     */
    public String zipZap(String str) {

        String newStr = "";
        char[] chars = str.toCharArray();

        if (str.length() < 3) {
            return str;
        }

        for (int i = 0; i <= str.length() - 3; i++) {

            if (chars[i] == 'z' && chars[i + 2] == 'p') {

                newStr = newStr + chars[i];
                newStr = newStr + chars[i + 2];
                i = i + 2;
            } else {
                newStr = newStr + chars[i];

                if (i == str.length() - 3) {
                    newStr = newStr + chars[i + 1] + chars[i + 2];
                }

            }
        }

        return newStr;
    }

}
