package practice.codingbat.warm_up_1;

public class StartOz {

    /**
     * 
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if
     * it is 'z', so "ozymandias" yields "oz".
     * 
     * 
     * @param str
     * @return
     */
    public static String startOz(String str) {

        String newStr = "";
        if (str.length() >= 1) {
            if (str.length() >= 2 && Character.toString(str.charAt(0))
                                              .equals("o")
                    && Character.toString(str.charAt(1))
                                .equals("z")) {
                newStr = "oz";
            } else if (Character.toString(str.charAt(0))
                                .equals("o")) {
                newStr = "o";
            } else if (Character.toString(str.charAt(1))
                                .equals("z")) {
                newStr = "z";
            }
        }
        return newStr;
    }

}
