package practice.codingbat.warm_up_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountXX {

    /**
     * 
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     * 
     * 
     * xx 1 xxx 2 xxxx 3 xxxxx n - 1
     * 
     * @param str
     * @return
     */
    public static int countXX(String str) {

        List<Integer> cont_xs = new ArrayList<>();

        int count = 0;
        for (char i : str.toCharArray()) {
            if (i == 'x')
                count++;
            else {
                cont_xs.add(count);
                count = 0;
            }
        }
        cont_xs.add(count);
        System.out.println(cont_xs);

        return cont_xs.stream()
                      .filter(i -> i > 0)
                      .map(i -> i - 1)
                      .collect(Collectors.summingInt(Integer::valueOf));

    }

}
