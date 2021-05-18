package practice.codingbat.warm_up_1;

public class MixStart {

    /**
     * 
     * 
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     * 
     * 
     * 
     * 
     * @param str
     * @return
     */
    public static boolean mixStart(String str) {
        return str.length() >= 3 && str.substring(1, 3)
                                       .equals("ix");
    }

}
