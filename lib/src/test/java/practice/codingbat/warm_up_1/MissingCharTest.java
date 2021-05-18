package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MissingCharTest {

    @Test
    public void test_missing_char() {

        assertThat(MissingChar.missingChar("hello", 0)).isEqualTo("ello");
        assertThat(MissingChar.missingChar("hello", 2)).isEqualTo("heo");

        // assertThat(MissingChar.missingChar("hello", 2)).isEqualTo("helo");

    }

}
