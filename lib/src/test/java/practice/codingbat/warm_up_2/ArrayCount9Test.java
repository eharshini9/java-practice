package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArrayCount9Test {

    @Test
    public void test_array_count_9() {

        assertThat(ArrayCount9.arrayCount9(new int[] { 8, 9, 5, 6, 9 })).isEqualTo(2);
        assertThat(ArrayCount9.arrayCount9(new int[] { 7, 6, 5 })).isEqualTo(0);
        assertThat(ArrayCount9.arrayCount9(new int[] { 9, 9, 9, 9 })).isEqualTo(4);
    }
}
