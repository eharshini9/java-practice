package practice.condigbat.string_1;

public class Without2 {

    /**
     * 
     * Given a string, if a length 2 substring appears at both its beginning and
     * end, return a string without the substring at the beginning, so "HelloHe"
     * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
     * Otherwise, return the original string unchanged.
     * 
     * @param str
     * @return
     */
    public String without2(String str) {

        return str.length() >= 2 && str.substring(0, 2)
                                       .equals(str.substring(str.length() - 2)) ? str.substring(2) : str;

    }
}
