package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MonkeyTroubleTest {

    @Test
    public void test_monkey_trouble() {

        assertThat(MonkeyTrouble.monkeyTrouble(false, false)).isTrue();
        assertThat(MonkeyTrouble.monkeyTrouble(true, true)).isTrue();
        assertThat(MonkeyTrouble.monkeyTrouble(false, true)).isFalse();
        assertThat(MonkeyTrouble.monkeyTrouble(true, false)).isFalse();
    }

}
