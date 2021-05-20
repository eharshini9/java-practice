package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CountXXTest {

    @Test
    public void test_count_xx() {

        assertThat(CountXX.countXX("helxxo")).isEqualTo(1);
        assertThat(CountXX.countXX("hexxxxxxxxo")).isEqualTo(7);
        assertThat(CountXX.countXX("axbxcxdbyx")).isEqualTo(0);

    }

}
