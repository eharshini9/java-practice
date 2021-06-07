package practice.codingbat.string_2;

public class XyBalance {

    /**
     * 
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy" is
     * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
     * the given string is xy-balanced.
     * 
     * 
     * @param str
     * @return
     */
    public boolean xyBalance(String str) {

        return str.isEmpty() || !str.contains("x") || str.lastIndexOf('y') > str.lastIndexOf('x');
    }

}
