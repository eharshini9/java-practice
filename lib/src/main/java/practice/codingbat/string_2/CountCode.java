package practice.codingbat.string_2;

public class CountCode {

    /**
     * 
     * 
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     * 
     * @param str
     * @return
     */
    public int countCode(String str) {

        char[] chars = str.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length - 3; i++) {

            if (str.substring(i, i + 2)
                   .equals("co")
                    && str.substring(i + 3, i + 4)
                          .equals("e")) {
                count++;
            }

        }
        return count;
    }

}
