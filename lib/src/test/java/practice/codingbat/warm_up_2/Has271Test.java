package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Has271Test {

    @Test
    public void test_has_271() {

        assertThat(Has271.has271(new int[] { 3, 8, 1 })).isTrue();
        assertThat(Has271.has271(new int[] { 4, 9, 3 })).isTrue();
        assertThat(Has271.has271(new int[] { 2, 8, 1 })).isFalse();
        assertThat(Has271.has271(new int[] { 6, 11, 1 })).isFalse();
    }

}
