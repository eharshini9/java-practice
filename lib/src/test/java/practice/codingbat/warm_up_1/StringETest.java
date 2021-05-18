package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringETest {

    @Test
    public void test_string_e() {

        assertThat(StringE.stringE("helele")).isTrue();
        assertThat(StringE.stringE("heleleleee")).isFalse();
        assertThat(StringE.stringE("")).isFalse();
        assertThat(StringE.stringE("hela")).isTrue();
    }

}
