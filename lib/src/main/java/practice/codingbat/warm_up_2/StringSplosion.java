package practice.codingbat.warm_up_2;

public class StringSplosion {

    /**
     * 
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     * 
     * @param str
     * @return
     */
    public static String stringSplosion(String str) {

        String newStr = "";
        for (int i = 1; i <= str.length(); i++) {

            String subStr = str.substring(0, i);

            newStr = newStr.concat(subStr);
        }
        return newStr;
    }

}
