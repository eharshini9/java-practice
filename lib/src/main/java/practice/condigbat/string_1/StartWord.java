package practice.condigbat.string_1;

public class StartWord {

    /**
     * 
     * Given a string and a second "word" string, we'll say that the word matches
     * the string if it appears at the front of the string, except its first char
     * does not need to match exactly. On a match, return the front of the string,
     * or otherwise return the empty string. So, so with the string "hippo" the word
     * "hi" returns "hi" and "xip" returns "hip". The word will be at least length
     * 1.
     * 
     * @param str
     * @param word
     * @return
     */
    public String startWord(String str, String word) {

        if (str.length() >= word.length() && word.length() > 1) {
            if (word.substring(1)
                    .equals(str.substring(1, word.length()))) {
                return str.substring(0, word.length());
            }
        }
        return str.length() >= word.length() && word.length() == 1 ? str.substring(0, 1) : "";

    }

}
