package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class FrontBackTest {

    @Test
    public void test_front_back() {

        assertThat(FrontBack.frontBack("hello")).isEqualTo("oellh");
        assertThat(FrontBack.frontBack("a")).isEqualTo("a");
        assertThat(FrontBack.frontBack("")).isEqualTo("");

        assertThat(FrontBack.frontBack1("pob")).isEqualTo("bop");
        assertThat(FrontBack.frontBack1("asa")).isEqualTo("asa");
        assertThat(FrontBack.frontBack1("d")).isEqualTo("d");
        assertThat(FrontBack.frontBack1("")).isEqualTo("");

    }

}
