package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LoneTeenTest {

    @Test
    public void test_lone_teen() {
        assertThat(LoneTeen.loneTeen(13, 18)).isFalse();
        assertThat(LoneTeen.loneTeen(15, 23)).isTrue();
        assertThat(LoneTeen.loneTeen(12, 16)).isTrue();
        assertThat(LoneTeen.loneTeen(8, 32)).isFalse();

    }

}
