package practice.codingbat.warm_up_1;

public class BackAround {

    /**
     * 
     * Given a string, take the last char and return a new string with the last char
     * added at the front and back, so "cat" yields "tcatt". The original string
     * will be length 1 or more.
     * 
     * 
     * @param str
     * @return
     */
    public static String backAround(String str) {

        return (str.substring(str.length() - 1)
                   .concat(str)).concat(str.substring(str.length() - 1));

    }

}
