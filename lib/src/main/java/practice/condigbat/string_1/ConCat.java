package practice.condigbat.string_1;

public class ConCat {

    public String conCat(String a, String b) {

        // sol1:
        if (a.length() == 0) {
            return b;
        } else if (b.length() == 0) {
            return a;
        }

        String newb = b.substring(1);
        if (a.charAt(a.length() - 1) == b.charAt(0)) {
            newb = b;
            return a + newb;
        }
        return a + b;

        // sol 2:
        /*
         * if (a.length() == 0) { return b; } else if (b.length() == 0) { return a; }
         * 
         * b = (a.charAt(a.length()-1)) == b.charAt(0) ? b.substring(1) : b; return a +
         * b;
         */
    }

}
