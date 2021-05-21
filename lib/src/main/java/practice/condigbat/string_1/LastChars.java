package practice.condigbat.string_1;

public class LastChars {

    public String lastChars(String a, String b) {

        String newa = a.length() == 0 ? "@" : a.substring(0, 1);
        String newb = b.length() == 0 ? "@" : b.substring(b.length() - 1);

        return newa + newb;

    }

}
