package practice.condigbat.string_1;

public class TheEnd {

    /**
     * 
     * Given a string, return a string length 1 from its front, unless front is
     * false, in which case return a string length 1 from its back. The string will
     * be non-empty.
     * 
     * @param str
     * @param front
     * @return
     */
    public String theEnd(String str, boolean front) {

        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }

}
