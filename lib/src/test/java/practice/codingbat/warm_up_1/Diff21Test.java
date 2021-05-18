package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Diff21Test {

    @Test
    public void test_diff_21() {

        assertThat(Diff21.diff21(41)).isEqualTo(40);
        assertThat(Diff21.diff21(21)).isEqualTo(0);
        assertThat(Diff21.diff21(20)).isEqualTo(1);

    }

}
