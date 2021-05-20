package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FrontTimesTest {

    @Test
    public void test_front_times() {

        assertThat(FrontTimes.frontTimes("hello", 6)).isEqualTo("helhelhelhelhelhel");
        assertThat(FrontTimes.frontTimes("ab", 5)).isEqualTo("ababababab");
        assertThat(FrontTimes.frontTimes("", 1)).isEqualTo("");
    }

}
