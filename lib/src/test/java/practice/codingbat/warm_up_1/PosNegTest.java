package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PosNegTest {

    @Test
    public void test_pos_neg() {

        assertThat(PosNeg.posNeg(-1, 1, false)).isTrue();
        assertThat(PosNeg.posNeg(1, -10, false)).isTrue();
        assertThat(PosNeg.posNeg(-1, -10, false)).isFalse();
        assertThat(PosNeg.posNeg(-3, -7, true)).isTrue();
        assertThat(PosNeg.posNeg(1, -7, true)).isFalse();
        assertThat(PosNeg.posNeg(9, 8, false)).isFalse();

    }

}
