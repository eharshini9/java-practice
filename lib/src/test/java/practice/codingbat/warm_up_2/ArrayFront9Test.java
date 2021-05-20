package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ArrayFront9Test {

    @Test
    public void test_array_front_9() {

        assertThat(ArrayFront9.arrayFront9(new int[] { 8, 9 })).isTrue();
        assertThat(ArrayFront9.arrayFront9(new int[] { 1, 8, 6, 5 })).isFalse();
        assertThat(ArrayFront9.arrayFront9(new int[] { 1, 2, 3, 4, 9, 9, 9 })).isFalse();
        assertThat(ArrayFront9.arrayFront9(new int[] { 1, 2, 9, 4, 9, 9, 9 })).isTrue();
    }

}
