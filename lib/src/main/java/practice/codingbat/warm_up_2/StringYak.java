package practice.codingbat.warm_up_2;

public class StringYak {

    /**
     * 
     * Suppose the string "yak" is unlucky. Given a string, return a version where
     * all the "yak" are removed, but the "a" can be any char. The "yak" strings
     * will not overlap.
     * 
     * @param str
     * @return
     */
    public static String stringYak(String str) {
        return str.replaceAll("yak", "");
    }

}
