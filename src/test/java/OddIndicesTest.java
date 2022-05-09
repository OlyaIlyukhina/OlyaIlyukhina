import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesHappyPathQ() {

       int[] array = {-45, 590, 234};
        int[] expectedResult = {-45, 234};

        OddIndices oddIndices = new OddIndices();
        int[] actualResult = oddIndices.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
