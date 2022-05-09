import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Test
    public void testReverseArrayHappyPath() {
        int[] array = {2, 7, 3, 10};
        int[] expectedResult = {10, 3, 7, 2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathZero() {
        int[] array = {2, 7, 3, 10, 0};
        int[] expectedResult = {0, 10, 3, 7, 2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayHappyPathNegative() {
        int[] array = {-2, -7, -3, -10, 0};
        int[] expectedResult = {0, -10, -3, -7, -2};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseArrayEmpty() {
        int[] array = {};
        int[] expectedResult = {};

        ReverseArray reverseArray = new ReverseArray();
        int[] actualResult = reverseArray.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
