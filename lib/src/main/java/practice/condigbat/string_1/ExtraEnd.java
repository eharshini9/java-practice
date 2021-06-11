package practice.condigbat.string_1;

import practice.common.utils.StringUtils;

public class ExtraEnd {

    /**
     * 
     * Given a string, return a new string made of 3 copies of the last 2 chars of
     * the original string. The string length will be at least 2.
     * 
     * @param str
     * @return
     */
    public String extraEnd(String str) {
        String newStr = str.substring(str.length() - 2);

        return StringUtils.repeat(newStr, 3);
    }

}
