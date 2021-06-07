package practice.codingbat.string_2;

public class WordEnds {

    /**
     * 
     * 
     * Given a string and a non-empty word string, return a string made of each char
     * just before and just after every appearance of the word in the string. Ignore
     * cases where there is no char before or after the word, and a char may be
     * included twice if it is between two words.
     * 
     * @param str
     * @param word
     * @return
     */
    public String wordEnds(String str, String word) {

        String finalStr = "";

        char[] chars = str.toCharArray();

        for (int i = 0; i <= (chars.length - word.length()); i++) {

            if (str.substring(i, i + word.length())
                   .equalsIgnoreCase(word)) {
                if (i != 0) {
                    finalStr = finalStr + chars[i - 1];
                }

                if (i != chars.length - word.length()) {
                    finalStr = finalStr + chars[i + word.length()];
                }
            }
        }
        return finalStr;
    }

}
