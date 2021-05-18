package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Max1020Test {

    @Test
    public void test_max_10_20() {

        assertThat(Max1020.max1020(10, 4)).isEqualTo(10);
        assertThat(Max1020.max1020(10, 26)).isEqualTo(10);
        assertThat(Max1020.max1020(4, 24)).isEqualTo(0);
    }

}
