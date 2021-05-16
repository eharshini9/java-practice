package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SleepInTest {

    @Test
    public void test_sleep_in() {
        assertThat(SleepIn.sleepIn(false, false)).isTrue();
        assertThat(SleepIn.sleepIn(true, true)).isTrue();
        assertThat(SleepIn.sleepIn(true, false)).isFalse();
        assertThat(SleepIn.sleepIn(false, true)).isTrue();
    }

}
