import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqualHappyPathEqual() {
        int n1 = 89;
        int n2 = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqualAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathSmaller() {
        int n1 = -89;
        int n2 = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqualAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersEqualHappyPathLarger() {
        int n1 = 89;
        int n2 = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumbersEqual = new AreNumbersEqual();
        int actualResult = areNumbersEqual.areNumbersEqualAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
