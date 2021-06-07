package practice.codingbat.string_2;

public class CountHi {

    public int countHi(String str) {

        char[] chars = str.toCharArray();

        int count = 0;
        for (int i = 0; i < chars.length - 1; i++) {

            if (str.substring(i, i + 2)
                   .equals("hi")) {
                count++;
            }
        }
        return count;
    }

}
