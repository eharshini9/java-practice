package practice.codingbat.warm_up_1;

public class IcyHot {

    /**
     * 
     * Given two temperatures, return true if one is less than 0 and the other is
     * greater than 100
     * 
     * 
     * @param temp1
     * @param temp2
     * @return
     */
    public static boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

}
