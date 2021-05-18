package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class In3050Test {

    @Test
    public void test_in_30_50() {

        assertThat(In3050.in3050(30, 39)).isTrue();
        assertThat(In3050.in3050(45, 50)).isTrue();
        assertThat(In3050.in3050(30, 45)).isFalse();
        assertThat(In3050.in3050(30, 28)).isFalse();
        assertThat(In3050.in3050(46, 2)).isFalse();
        assertThat(In3050.in3050(48, 87)).isFalse();
    }

}
