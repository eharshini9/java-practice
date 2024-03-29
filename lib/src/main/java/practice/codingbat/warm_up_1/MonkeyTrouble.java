package practice.codingbat.warm_up_1;

public class MonkeyTrouble {

    /**
     * 
     * * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
     * if each is smiling. We are in trouble if they are both smiling or if neither
     * of them is smiling. Return true if we are in trouble.
     * 
     * 
     * 
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

}
