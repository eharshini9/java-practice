package practice.condigbat.string_1;

public class LastTwo {

    public String lastTwo(String str) {

        if (str.length() < 2) {
            return str;
        }

        String newStr1 = str.substring(0, str.length() - 2);
        String newStr2 = str.substring(str.length() - 2);

        StringBuilder st = new StringBuilder(newStr2);

        return newStr1 + st.reverse();
    }

}
