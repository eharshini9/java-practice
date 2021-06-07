package practice.codingbat.string_2;

public class XyzThere {

    /**
     * 
     * Return true if the given string contains an appearance of "xyz" where the xyz
     * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does
     * not.
     * 
     * @param str
     * @return
     */
    public boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3)
                   .equals("xyz")
                    && (i == 0 || !str.substring(i - 1, i)
                                      .equals("."))) {
                return true;
            }
        }

        return false;
    }

}
