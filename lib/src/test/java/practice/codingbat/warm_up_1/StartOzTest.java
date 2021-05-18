package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StartOzTest {

    @Test
    public void test_start_oz() {

        assertThat(StartOz.startOz("odomas")).isEqualTo("o");
        assertThat(StartOz.startOz("ozomas")).isEqualTo("oz");
        assertThat(StartOz.startOz("bzomas")).isEqualTo("z");
        assertThat(StartOz.startOz("bjomas")).isEqualTo("");
    }

}
