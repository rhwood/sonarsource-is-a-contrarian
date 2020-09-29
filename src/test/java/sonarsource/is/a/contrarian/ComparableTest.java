package sonarsource.is.a.contrarian;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * Simple test that demonstrates some contrarian behaviors in SonarCloud.
 */
class ComparableTest {

    @Test
    void testCompareTo() {
        // these two statements have contradictory code smells
        assertThat("foo".compareTo("bar")).isPositive();
        assertThat("foo".compareTo("bar")).isGreaterThan(0);
        // these two statements have contradictory code smells
        assertThat("bar".compareTo("foo")).isNegative();
        assertThat("bar".compareTo("foo")).isLessThan(0);
        // these two statements have code smells, but the third does not, yet
        // it seems these should be preferable to the last based on the comments
        // in java:S5838
        assertThat("foo".compareTo("foo")).isZero();
        assertThat("foo".compareTo("foo")).isEqualTo(0);
        assertThat("foo".compareTo("foo")).isEqualByComparingTo(0);
    }

}
