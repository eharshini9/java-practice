package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Or35Test {

    @Test
    public void test_or_3_5() {

        assertThat(Or35.or35(9)).isTrue();
        assertThat(Or35.or35(15)).isTrue();
        assertThat(Or35.or35(10)).isTrue();
        assertThat(Or35.or35(2)).isFalse();
        assertThat(Or35.or35(1)).isFalse();
        assertThat(Or35.or35(16)).isFalse();
    }

}
