import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Test
    @Order(1)
    public void testMinMaxAveHappyPath() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        int n2 = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveHappyPathZero() {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0};
        int n1 = 1;
        int n2 = 4;
        int[] expectedResult = {0, 0, 0};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testMinMaxAveIndexNegativeIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = -1;
        int n2 = 6;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexZeroIndex() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 1;
        int n2 = 1;
        int[] expectedResult = {2, 2, 2};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveIndexOutOfBound() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 111;
        int n2 = 1111;
        int[] expectedResult = {};

        MinMaxAve minMaxAve = new MinMaxAve();
        int[] actualResult = minMaxAve.minMaxAveAlgorithm(array, n1, n2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
