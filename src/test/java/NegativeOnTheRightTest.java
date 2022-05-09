import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NegativeOnTheRightTest {

    @Test
    public void testNegativeOnTheRightHappyPath() {
        int[] array = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = new int[]{4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightHappyPathMostlyNegative() {
        int[] array = new int[]{-4, -3, 7, -12, -5, -2, -9, 4, 12};
        int[] expectedResult = new int[]{7, 4, 12, -9, -2, -5, -12, -3, -4};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightAllNegative() {
        int[] array = new int[]{-4, -3, -7, -12, -5, -2, -9, -4, -12};
        int[] expectedResult = new int[]{-12, -4, -9, -2, -5, -12, -7, -3, -4};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeOnTheRightNoNegative() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = new int[]{4, 3, 7, 12, 5, 2, 9, 4,12};

        NegativeOnTheRight negativeOnTheRight = new NegativeOnTheRight();
        int[] actualResult = negativeOnTheRight.negativeOnTheRightAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
