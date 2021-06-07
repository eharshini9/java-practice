package practice.codingbat.string_2;

public class EndOther {

    /**
     * 
     * Given two strings, return true if either of the strings appears at the very
     * end of the other string, ignoring upper/lower case differences (in other
     * words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     * 
     * 
     * @param a
     * @param b
     * @return
     */
    public boolean endOther(String a, String b) {

        if ((a.length() - b.length() > 0) && a.substring(a.length() - b.length())
                                              .equalsIgnoreCase(b)) {

            return true;
        }
        if ((a.length() - b.length() < 0) && b.substring(b.length() - a.length())
                                              .equalsIgnoreCase(a)) {

            return true;
        }

        return a.equalsIgnoreCase(b);
    }

}
