package practice.condigbat.string_1;

public class EndsLy {

    /**
     * 
     * Given a string, return true if it ends in "ly".
     * 
     * @param str
     * @return
     */
    public static boolean endsLy(String str) {

        // 1:

        /*
         * if (str.length() < 2) { return false; }
         * 
         * return str.substring(str.length() - 2) .equals("ly") ? true : false;
         */

        // 2:
        return str.contains("ly") && (str.length() - str.lastIndexOf("ly") == 2);
    }

}
