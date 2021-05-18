package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BackAroundTest {

    @Test
    public void test_back_around() {

        assertThat(BackAround.backAround("a")).isEqualTo("aaa");
        assertThat(BackAround.backAround("cat")).isEqualTo("tcatt");
    }

}
