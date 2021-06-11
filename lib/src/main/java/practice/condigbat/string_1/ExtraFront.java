package practice.condigbat.string_1;

import practice.common.utils.StringUtils;

public class ExtraFront {

    /**
     * 
     * 
     * Given a string, return a new string made of 3 copies of the first 2 chars of
     * the original string. The string may be any length. If there are fewer than 2
     * chars, use whatever is there.
     * 
     * @param str
     * @return
     */
    public static String extraFront(String str) {

        return str.length() < 2 ? StringUtils.repeat(str, 3) : StringUtils.repeat(str.substring(0, 2), 3);
    }

}
