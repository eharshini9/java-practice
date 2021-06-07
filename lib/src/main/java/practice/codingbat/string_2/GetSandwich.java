package practice.codingbat.string_2;

public class GetSandwich {

    /**
     * 
     * 
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the given
     * string, or return the empty string "" if there are not two pieces of bread.
     * 
     * @param str
     * @return
     */
    public String getSandwich(String str) {
        String finalStr = "";

        if (!str.isEmpty() && str.contains("bread") && str.indexOf("bread") != str.lastIndexOf("bread")) {

            return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
        }

        return finalStr;

    }

}
