package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HasTeenTest {

    @Test
    public void test_has_teen() {

        assertThat(HasTeen.hasTeen(13, 8, 7)).isTrue();
        assertThat(HasTeen.hasTeen(12, 16, 19)).isTrue();
        assertThat(HasTeen.hasTeen(6, 17, 6)).isTrue();
        assertThat(HasTeen.hasTeen(24, 42, 21)).isFalse();
        assertThat(HasTeen.hasTeen(12, 4, 9)).isFalse();
        assertThat(HasTeen.hasTeen(15, 16, 17)).isTrue();

    }

}
