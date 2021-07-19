package practice.codingbat.string_2;

public class Plusout {

    /**
     * 
     * Given a string and a non-empty word string, return a version of the original
     * String where all chars have been replaced by pluses ("+"), except for
     * appearances of the word string which are preserved unchanged.
     * 
     * @param str
     * @param word
     * @return
     */
    public static String plusOut(String str, String word) {

        String finalStr = "";

        for (int i = 0; i <= str.length() - word.length(); i++) {

            if (str.substring(i, i + word.length())
                   .equals(word)) {
                finalStr = finalStr + str.substring(i, i + word.length());

                i = i + word.length() - 1;

            } else {

                finalStr = finalStr + '+';

                if (i == str.length() - word.length()) {

                    for (int j = 1; j <= i; j++) {
                        finalStr = finalStr + "+";
                    }

                }
            }
        }
        return finalStr;
    }

    public static void main(String[] args) {

        System.out.println(plusOut("abXYabcXYZ", "XY"));

    }

}
