package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringBitsTest {

    @Test
    public void test_string_bits() {

        assertThat(StringBits.stringBits("helojdkj")).isEqualTo("hljk");
        assertThat(StringBits.stringBits("shgdjdd")).isEqualTo("sgjd");

    }

}
