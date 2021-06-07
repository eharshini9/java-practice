package practice.codingbat.string_2;

public class XyzMiddle {

    /**
     * 
     * Given a string, does "xyz" appear in the middle of the string? To define
     * middle, we'll say that the number of chars to the left and right of the "xyz"
     * must differ by at most one. This problem is harder than it looks.
     * 
     * @param str
     * @return
     */
    public boolean xyzMiddle(String str) {

        if (!str.isEmpty() && str.contains("xyz")) {

            int sL = str.length();

            if (sL % 2 == 0) {
                return str.substring((sL / 2) - 1, (sL / 2) + 2)
                          .equals("xyz")
                        || str.substring((sL / 2) - 2, (sL / 2) + 1)
                              .equals("xyz");
            }

            return str.substring(((sL - 1) / 2) - 1, ((sL - 1) / 2) + 2)
                      .equals("xyz");
        }

        return false;
    }

}
