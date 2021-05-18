package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DelDelTest {

    @Test
    public void test_del_del() {

        assertThat(DelDel.delDel("udela")).isEqualTo("ua");
        assertThat(DelDel.delDel("adel")).isEqualTo("a");
        assertThat(DelDel.delDel("vde")).isEqualTo("vde");
        assertThat(DelDel.delDel("uDela")).isEqualTo("uDela");
    }

}
