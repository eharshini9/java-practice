package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringXTest {

    @Test
    public void test_string_x() {

        assertThat(StringX.stringX("xhelloxhix")).isEqualTo("xhellohix");
        assertThat(StringX.stringX("")).isEqualTo("");
        assertThat(StringX.stringX("xxxxxx")).isEqualTo("xx");
        assertThat(StringX.stringX("hghxki")).isEqualTo("hghki");

    }

}
