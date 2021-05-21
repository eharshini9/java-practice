package practice.condigbat.string_1;

public class Middle2 {

    /**
     * 
     * Given a string of even length, return a string made of the middle two chars,
     * so the string "string" yields "ri". The string length will be at least 2.
     * 
     * @param str
     * @return
     */
    public String middleTwo(String str) {

        return str.substring((str.length() / 2) - 1, str.length() / 2 + 1);
    }

}
