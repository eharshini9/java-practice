package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Last2Test {

    @Test
    public void test_last_2() {

        assertThat(Last2.last2("henhdkjdhhecmnbcjjhe")).isEqualTo(2);
        assertThat(Last2.last2("hohdjkdhjdhhojhjb")).isEqualTo(0);
        assertThat(Last2.last2("hidhdhi")).isEqualTo(1);

    }

}
