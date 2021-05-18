package practice.codingbat.warm_up_1;

public class DelDel {

    /**
     * 
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     * 
     * 
     * @param str
     * @return
     */
    public static String delDel(String str) {

        if (str.length() < 4 || !(str.substring(1, 4)
                                     .equals("del"))) {
            return str;
        }
        return str.substring(0, 1)
                  .concat(str.substring(4));

    }

}
