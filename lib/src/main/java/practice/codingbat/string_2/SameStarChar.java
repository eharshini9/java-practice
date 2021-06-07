package practice.codingbat.string_2;

public class SameStarChar {

    /**
     * 
     * 
     * Returns true if for every '*' (star) in the string, if there are chars both
     * immediately before and after the star, they are the same.
     * 
     * @param str
     * @return
     */
    public boolean sameStarChar(String str) {

        if (str.isEmpty() || !str.contains("*") || str.length() < 3) {
            return true;
        }

        char[] chars = str.toCharArray();

        for (int i = 1; i < chars.length - 1; i++) {

            if (chars[i] == '*' && (chars[i - 1] != chars[i + 1])) {
                return false;
            }

        }

        return true;

    }

}
