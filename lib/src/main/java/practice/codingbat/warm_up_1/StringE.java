package practice.codingbat.warm_up_1;

public class StringE {

    /**
     * 
     * 
     * Return true if the given string contains between 1 and 3 'e' chars.
     * 
     * @param str
     * @return
     */
    public static boolean stringE(String str) {

        char[] chars = str.toCharArray();

        int incrementValue = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            if (Character.toString(chars[i])
                         .equals("e")) {
                incrementValue++;
            }
        }
        return str.contains("e") && (incrementValue >= 1 && incrementValue <= 3);

    }
}
