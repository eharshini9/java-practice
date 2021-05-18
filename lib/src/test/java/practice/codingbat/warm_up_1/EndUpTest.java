package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EndUpTest {

    @Test
    public void test_end_up() {

        assertThat(EndUp.endUp("abctest")).isEqualTo("abctEST");
        assertThat(EndUp.endUp("abc")).isEqualTo("ABC");
        assertThat(EndUp.endUp("ab")).isEqualTo("AB");
        assertThat(EndUp.endUp("a")).isEqualTo("A");
        assertThat(EndUp.endUp("")).isEqualTo("");

    }

}
