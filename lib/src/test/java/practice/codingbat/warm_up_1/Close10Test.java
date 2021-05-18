package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Close10Test {

    @Test
    public void test_close_10() {

        assertThat(Close10.close10(15, 12)).isEqualTo(12);
        assertThat(Close10.close10(9, 12)).isEqualTo(9);
        assertThat(Close10.close10(8, 12)).isEqualTo(0);

    }

}
