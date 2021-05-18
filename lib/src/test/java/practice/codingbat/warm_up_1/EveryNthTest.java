package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EveryNthTest {

    @Test
    public void test_every_nth() {

        assertThat(EveryNth.everyNth("hello", 1)).isEqualTo("hello");
        assertThat(EveryNth.everyNth("hello", 2)).isEqualTo("hlo");
        assertThat(EveryNth.everyNth("jdhdjdh", 3)).isEqualTo("jdh");
        assertThat(EveryNth.everyNth("h", 3)).isEqualTo("h");
    }

}
