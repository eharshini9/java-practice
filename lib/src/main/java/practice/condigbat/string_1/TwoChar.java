package practice.condigbat.string_1;

public class TwoChar {

    /**
     * 
     * Given a string and an index, return a string length 2 starting at the given
     * index. If the index is too big or too small to define a string length 2, use
     * the first 2 chars. The string length will be at least 2.
     * 
     * @param str
     * @param index
     * @return
     */
    public String twoChar(String str, int index) {

        return index >= str.length() - 1 || index < 0 ? str.substring(0, 2) : str.substring(index, index + 2);
    }

}
