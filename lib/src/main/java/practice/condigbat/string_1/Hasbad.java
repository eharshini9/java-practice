package practice.condigbat.string_1;

public class Hasbad {

    public boolean hasBad(String str) {

        // sol1

        /*
         * if (str.length() < 3) { return false; } else if (str.length() == 3) { return
         * str.substring(0, 3) .equals("bad"); } return str.substring(1, 4)
         * .equals("bad") || str.substring(0, 3) .equals("bad");
         */

        // sol2

        if (str.length() >= 3 && str.substring(0, 3)
                                    .equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4)
                                    .equals("bad")) {
            return true;
        }
        return false;

    }

}
