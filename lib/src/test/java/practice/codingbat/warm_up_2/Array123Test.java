package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Array123Test {

    @Test
    public void test_array_123() {

        assertThat(Array123.array123(new int[] { 2, 3, 6, 8, 9, 1 })).isFalse();
        assertThat(Array123.array123(new int[] { 1, 2, 3, 6, 7 })).isTrue();
        assertThat(Array123.array123(new int[] { 2, 3, 1, 9 })).isFalse();
        assertThat(Array123.array123(new int[] { 7, 8, 1, 2, 3 })).isTrue();
        assertThat(Array123.array123(new int[] { 7, 8, 5, 4 })).isFalse();
    }

}
