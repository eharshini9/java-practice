package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NearHundredTest {

    @Test
    public void test_near_hundred() {

        assertThat(NearHundred.nearHundred(89)).isFalse();
        assertThat(NearHundred.nearHundred(111)).isFalse();
        assertThat(NearHundred.nearHundred(189)).isFalse();
        assertThat(NearHundred.nearHundred(211)).isFalse();
        assertThat(NearHundred.nearHundred(208)).isTrue();
        assertThat(NearHundred.nearHundred(197)).isTrue();
        assertThat(NearHundred.nearHundred(97)).isTrue();
        assertThat(NearHundred.nearHundred(104)).isTrue();
    }

}
