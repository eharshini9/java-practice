package practice.codingbat.string_2;

public class PrefixAgain {

    /**
     * 
     * Given a string, consider the prefix string made of the first N chars of the
     * string. Does that prefix string appear somewhere else in the string? Assume
     * that the string is not empty and that N is in the range 1..str.length().
     * 
     * 
     * 
     * @param str
     * @param n
     * @return
     */
    public boolean prefixAgain(String str, int n) {
        return str.substring(n)
                  .contains(str.substring(0, n));
    }

}
