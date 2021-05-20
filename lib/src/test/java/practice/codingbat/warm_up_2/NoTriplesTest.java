package practice.codingbat.warm_up_2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NoTriplesTest {

    @Test
    public void test_no_triples() {

        assertThat(NoTriples.noTriples(new int[] { 1, 2, 3, 3, 4 })).isTrue();
        assertThat(NoTriples.noTriples(new int[] { 2, 2, 2, 4, 5 })).isFalse();
        assertThat(NoTriples.noTriples(new int[] { 2, 3, 4, 2, 3, 1, 2 })).isTrue();

    }

}
