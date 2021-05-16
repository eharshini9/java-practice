package practice.codingbat.warm_up_1;

public class FrontBack {

    public String frontBack(String str) {

        char[] chars = new char[str.length() - 1];

        str.getChars(0, str.length() - 1, null, 0);

        return str;

    }

}
