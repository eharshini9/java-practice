package practice.condigbat.string_1;

public class WithoutX {

    /**
     * 
     * 
     * Given a string, if the first or last chars are 'x', return the string without
     * those 'x' chars, and otherwise return the string unchanged.
     * 
     * @param str
     * @return
     */
    public String withoutX(String str) {
        if (str.length() >= 2) {

            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length() - 1);
            }
            if (str.charAt(0) == 'x') {
                return str.substring(1);
            }
            if (str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length() - 1);
            }
        }

        return !str.isEmpty() && !str.equals("x") ? str : "";

    }

}
