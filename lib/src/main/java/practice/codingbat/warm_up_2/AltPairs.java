package practice.codingbat.warm_up_2;

public class AltPairs {

    /**
     * 
     * 
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
     * ... so "kittens" yields "kien".
     * 
     * @param str
     * @return
     */
    public static String altPairs(String str) {

        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            newStr += chars[i];
            if (i % 2 != 0) {
                i += 2;
            }
        }
        return newStr;
    }

}
