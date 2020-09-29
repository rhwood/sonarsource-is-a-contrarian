package sonarsource.is.a.contrarian;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ComparableTest {

    @Test
    void testCompareTo() {
        assertThat("foo".compareTo("bar")).isPositive();
        assertThat("foo".compareTo("bar")).isGreaterThan(0);
        assertThat("bar".compareTo("foo")).isNegative();
        assertThat("bar".compareTo("foo")).isLessThan(0);
        assertThat("foo".compareTo("foo")).isZero();
        assertThat("foo".compareTo("foo")).isEqualTo(0);
    }

}
