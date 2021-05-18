package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class In1020Test {

    @Test
    public void test_in_10_20() {

        assertThat(In1020.in1020(11, 20)).isTrue();
        assertThat(In1020.in1020(15, 28)).isTrue();
        assertThat(In1020.in1020(3, 17)).isTrue();
        assertThat(In1020.in1020(2, 48)).isFalse();
    }

}
