package practice.condigbat.string_1;

public class WithoutX2 {

    /**
     * 
     * Given a string, if one or both of the first 2 chars is 'x', return the string
     * without those 'x' chars, and otherwise return the string unchanged. This is a
     * little harder than it looks.
     * 
     * @param str
     * @return
     */
    public String withoutX2(String str) {

        if (str.length() >= 2) {
            if (str.startsWith("xx")) {
                return str.substring(2);
            }
            if (str.charAt(0) == 'x') {
                return str.substring(1);
            }
            if (str.charAt(1) == 'x') {
                return str.substring(0, 1) + str.substring(2);
            }

        }
        return !str.isEmpty() && !str.equals("x") ? str : "";
    }

}
