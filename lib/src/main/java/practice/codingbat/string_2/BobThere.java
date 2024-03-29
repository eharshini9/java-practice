package practice.codingbat.string_2;

public class BobThere {

    /**
     * 
     * Return true if the given string contains a "bob" string, but where the middle
     * 'o' char can be any char
     * 
     * @param str
     * @return
     */
    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }

        return false;
    }

}
