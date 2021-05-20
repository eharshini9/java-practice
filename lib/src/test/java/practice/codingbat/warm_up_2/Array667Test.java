package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Array667Test {

    @Test
    public void test_array_667() {

        assertThat(Array667.array667(new int[] { 5, 6, 7 })).isEqualTo(1);
        assertThat(Array667.array667(new int[] { 1, 4, 6, 6, 7, 8 })).isEqualTo(2);
        assertThat(Array667.array667(new int[] { 6, 9, 6, 6, 6, 7 })).isEqualTo(3);
        assertThat(Array667.array667(new int[] { 2, 5, 8, 9 })).isEqualTo(0);

    }

}
