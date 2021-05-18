package practice.codingbat.warm_up_1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ParrotTroubleTest {

    @Test
    public void test_parrot_trouble() {

        assertThat(ParrotTrouble.parrotTrouble(false, 6)).isFalse();
        assertThat(ParrotTrouble.parrotTrouble(false, 14)).isFalse();
        assertThat(ParrotTrouble.parrotTrouble(true, 14)).isFalse();
        assertThat(ParrotTrouble.parrotTrouble(true, 3)).isTrue();
        assertThat(ParrotTrouble.parrotTrouble(true, 22)).isTrue();
    }

}
