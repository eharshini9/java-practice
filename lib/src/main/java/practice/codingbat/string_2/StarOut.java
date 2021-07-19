package practice.codingbat.string_2;

public class StarOut {

    /**
     * 
     * 
     * Return a version of the given string, where for every star (*) in the string
     * the star and the chars immediately to its left and right are gone. So "ab*cd"
     * yields "ad" and "ab**cd" also yields "ad".
     * 
     * @param str
     * @return
     */
    public static String starOut(String str) {

        String finalStr = "";

        char[] chars = str.toCharArray();

        for (int i = 0; i <= chars.length - 1; i++) {

            if (i < chars.length - 2 && chars[i] == '*') {
                i = i + 1;
            } else if (i < chars.length - 3 && chars[i + 1] == '*') {
                i = i + 2;

            } else {
                finalStr = finalStr + chars[i];
            }

        }

        return finalStr;
    }

    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
    }
}
