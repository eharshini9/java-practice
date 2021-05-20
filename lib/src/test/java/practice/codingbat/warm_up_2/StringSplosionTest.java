package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class StringSplosionTest {

    @Test
    public void test_string_splosion() {

        assertThat(StringSplosion.stringSplosion("hello")).isEqualTo("hhehelhellhello");
        assertThat(StringSplosion.stringSplosion("Cake")).isEqualTo("CCaCakCake");
        assertThat(StringSplosion.stringSplosion("")).isEqualTo("");
        assertThat(StringSplosion.stringSplosion("ab")).isEqualTo("aab");
    }

}
