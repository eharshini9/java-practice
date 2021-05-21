package practice.condigbat.string_1;

public class SeeColor {

    /**
     * 
     * Given a string, if the string begins with "red" or "blue" return that color
     * string, otherwise return the empty string.
     * 
     * @param str
     * @return
     */
    public String seeColor(String str) {

        if (str.length() >= 4) {

            if (str.substring(0, 3)
                   .equals("red")) {
                return "red";
            }
            return str.substring(0, 4)
                      .equals("blue") ? "blue" : "";
        }

        return str.equals("red") ? "red" : "";
    }

}
