package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NotStringTest {

    @Test
    public void test_not_string() {

        assertThat(NotString.notString("hello")).isEqualTo("not hello");
        assertThat(NotString.notString("not hello")).isEqualTo("not hello");
        assertThat(NotString.notString("Not String")).isEqualTo("not Not String");

    }

}
