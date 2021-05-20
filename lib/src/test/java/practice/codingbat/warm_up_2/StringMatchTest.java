package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringMatchTest {

    @Test
    public void test_string_match() {

        assertThat(StringMatch.stringMatch("abcdce", "abcdef")).isEqualTo(3);
        assertThat(StringMatch.stringMatch("jhdkjdh", "hsgshshhsjk")).isEqualTo(0);
        assertThat(StringMatch.stringMatch("", "skhskjs")).isEqualTo(0);

    }

}
