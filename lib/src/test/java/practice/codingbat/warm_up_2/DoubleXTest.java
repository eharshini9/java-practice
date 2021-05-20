package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DoubleXTest {

    @Test
    public void test_double_x() {

        assertThat(DoubleX.doubleX("axbvgx")).isFalse();
        assertThat(DoubleX.doubleX("bxxkjdhkdjx")).isTrue();
        assertThat(DoubleX.doubleX("sxfmhfjxx")).isFalse();
        assertThat(DoubleX.doubleX("djhgd")).isFalse();
    }

}
