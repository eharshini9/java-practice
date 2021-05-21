package practice.condigbat.string_1;

public class MinCat {

    /**
     * 
     * 
     * Given two strings, append them together (known as "concatenation") and return
     * the result. However, if the strings are different lengths, omit chars from
     * the longer string so it is the same length as the shorter string. So "Hello"
     * and "Hi" yield "loHi". The strings may be any length.
     * 
     * @param a
     * @param b
     * @return
     */
    public String minCat(String a, String b) {

        if (a.length() == b.length()) {
            return a + b;
        }
        int x = a.length() - b.length();
        return x > 0 ? a.substring(x) + b : a + b.substring(-x);

    }

}
