package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StartHiTest {

    @Test
    public void test_start_hi() {

        assertThat(StartHi.startHi("hihello")).isTrue();
        assertThat(StartHi.startHi("High")).isFalse();
        assertThat(StartHi.startHi("")).isFalse();
        assertThat(StartHi.startHi("bhgkjhjh")).isFalse();
    }

}
