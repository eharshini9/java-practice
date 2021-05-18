package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class Front3Test {

    @Test
    public void test_front_3() {

        assertThat(Front3.front3("test")).isEqualTo("testestes");
        assertThat(Front3.front3("hghk")).isEqualTo("hghhghhgh");
        assertThat(Front3.front3("a")).isEqualTo("aaa");
        assertThat(Front3.front3("")).isEqualTo("");
        assertThat(Front3.front3("ab")).isEqualTo("ababab");
    }

}
