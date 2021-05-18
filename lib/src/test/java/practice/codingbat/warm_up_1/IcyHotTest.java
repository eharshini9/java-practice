package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class IcyHotTest {

    @Test
    public void test_icy_hot() {
        assertThat(IcyHot.icyHot(-1, 101)).isTrue();
        assertThat(IcyHot.icyHot(-1, 100)).isFalse();
        assertThat(IcyHot.icyHot(3, 101)).isFalse();
        assertThat(IcyHot.icyHot(4, 99)).isFalse();
    }

}
