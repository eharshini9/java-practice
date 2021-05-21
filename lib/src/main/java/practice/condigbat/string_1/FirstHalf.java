package practice.condigbat.string_1;

public class FirstHalf {

    /**
     * 
     * Given a string of even length, return the first half. So the string "WooHoo"
     * yields "Woo".
     * 
     * @param str
     * @return
     */
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

}
