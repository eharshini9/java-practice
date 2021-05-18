package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Makes10Test {

    @Test
    public void test_makes_10() {

        assertThat(Makes10.makes10(10, 10)).isTrue();
        assertThat(Makes10.makes10(8, 10)).isTrue();
        assertThat(Makes10.makes10(4, 6)).isTrue();
        assertThat(Makes10.makes10(8, 11)).isFalse();

    }

}
