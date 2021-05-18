package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Front22Test {

    @Test
    public void test_front_22() {

        assertThat(Front22.front22("Cat")).isEqualTo("CaCatCa");
        assertThat(Front22.front22("ol")).isEqualTo("ololol");
        assertThat(Front22.front22("a")).isEqualTo("aaa");
        assertThat(Front22.front22("")).isEqualTo("");

    }

}
