package practice.condigbat.string_1;

public class MiddleThree {

    /**
     * 
     * 
     * Given a string of odd length, return the string length 3 from its middle, so
     * "Candy" yields "and". The string length will be at least 3.
     * 
     * 
     * 
     * @param str
     * @return
     */
    public String middleThree(String str) {

        int x = (str.length() - 1) / 2;

        return str.substring(x - 1, x + 2);

    }

}
