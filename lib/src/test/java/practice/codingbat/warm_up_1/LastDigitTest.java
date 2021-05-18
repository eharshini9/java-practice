package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LastDigitTest {

    @Test
    public void test_last_digit() {

        assertThat(LastDigit.lastDigit(7, 17)).isTrue();
        assertThat(LastDigit.lastDigit(87, 57)).isTrue();
        assertThat(LastDigit.lastDigit(44, 184)).isTrue();
        assertThat(LastDigit.lastDigit(6, 78)).isFalse();
    }

}
