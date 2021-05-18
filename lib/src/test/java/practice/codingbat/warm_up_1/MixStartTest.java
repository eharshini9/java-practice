package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MixStartTest {

    @Test
    public void test_mix_start() {

        assertThat(MixStart.mixStart("mixvix")).isTrue();
        assertThat(MixStart.mixStart("myxvix")).isFalse();
        assertThat(MixStart.mixStart("nixhgj")).isTrue();
        assertThat(MixStart.mixStart("")).isFalse();
        assertThat(MixStart.mixStart("mivhjshjd")).isFalse();
        assertThat(MixStart.mixStart("mi")).isFalse();
    }

}
