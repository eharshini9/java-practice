package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class AltPairsTest {

    @Test
    public void test_alt_pairs() {

        assertThat(AltPairs.altPairs("kittens")).isEqualTo("kien");
        assertThat(AltPairs.altPairs("kittensjhhdkjhdjdh")).isEqualTo("kienhhjhdh");
        assertThat(AltPairs.altPairs("kittensdkjdhjd")).isEqualTo("kienkjjd");
        assertThat(AltPairs.altPairs("kittensdkuyuiyu")).isEqualTo("kienkuiy");

    }

}
