package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringYakTest {

    @Test
    public void test_string_yak() {

        assertThat(StringYak.stringYak("jhgdhyakdjjhdkj")).isEqualTo("jhgdhdjjhdkj");
        assertThat(StringYak.stringYak("hello")).isEqualTo("hello");
        assertThat(StringYak.stringYak("yakbakmakcak")).isEqualTo("bakmakcak");
    }

}
