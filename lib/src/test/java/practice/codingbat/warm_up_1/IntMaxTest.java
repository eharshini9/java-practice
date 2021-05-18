package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IntMaxTest {

    @Test
    public void test_int_max() {

        assertThat(IntMax.intMax(1, 4, 10)).isEqualTo(10);
        assertThat(IntMax.intMax(17, 67, 34)).isEqualTo(67);
        assertThat(IntMax.intMax(957, 74, 22)).isEqualTo(957);
        assertThat(IntMax.intMax(-957, -74, 22)).isEqualTo(22);
    }

}
