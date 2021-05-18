package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SumDoubleTest {

    @Test
    public void test_sum_double() {

        assertThat(SumDouble.sumDouble(2, 4)).isEqualTo(6);
        assertThat(SumDouble.sumDouble(5, 5)).isEqualTo(20);
        assertThat(SumDouble.sumDouble(4, 6)).isNotEqualTo(20);

    }

}
