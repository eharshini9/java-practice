package practice.codingbat.string_2;

public class MixString {

    /**
     * 
     * 
     * Given two strings, a and b, create a bigger string made of the first char of
     * a, the first char of b, the second char of a, the second char of b, and so
     * on. Any leftover chars go at the end of the result.
     * 
     * @param a
     * @param b
     * @return
     */
    public String mixString(String a, String b) {

        String finalStr = "";
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();

        if (charsA.length >= charsB.length) {

            for (int i = 0; i < charsB.length; i++) {

                finalStr = finalStr + charsA[i] + charsB[i];
            }

            if (charsA.length > charsB.length) {

                finalStr = finalStr + a.substring(a.length() - (a.length() - b.length()));
            }

            return finalStr;

        }

        for (int i = 0; i < charsA.length; i++) {

            finalStr = finalStr + charsA[i] + charsB[i];
        }
        return finalStr + b.substring(b.length() - (b.length() - a.length()));

    }

}
