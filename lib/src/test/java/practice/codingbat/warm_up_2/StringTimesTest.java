package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringTimesTest {

    @Test
    public void test_string_times() {

        assertThat(StringTimes.stringTimes("abc", 2)).isEqualTo("abcabc");
        assertThat(StringTimes.stringTimes("", 10)).isEqualTo("");
        assertThat(StringTimes.stringTimes("a", 6)).isEqualTo("aaaaaa");

    }

}
