package practice.codingbat.string_2;

public class CatDog {

    /**
     * 
     * 
     * Return true if the string "cat" and "dog" appear the same number of times in
     * the given string.
     * 
     * @param str
     * @return
     */
    public boolean catDog(String str) {

        int catCount = 0;
        int dogCount = 0;

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length - 2; i++) {
            if (str.substring(i, i + 3)
                   .equals("cat")) {
                catCount++;
            }
            if (str.substring(i, i + 3)
                   .equals("dog")) {
                dogCount++;
            }

        }

        return catCount == dogCount;
    }

}
