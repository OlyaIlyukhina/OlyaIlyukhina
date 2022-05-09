import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {

    @Test
    @Order(1)
    public void testSumOfTwoHappyPath() {
        int n = 12;
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSumOfTwoHappyPathZero() {
        int n = 0;
        int[] array = {0, 3, 0, 12};
        int[][] expectedResult = {{0, 0}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSumOfTwoHappyPathNegative() {
        int n = 12;
        int[] array = {-12, 3, 0, 24};
        int[][] expectedResult = {{-12, 24}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSumOfTwoHappyPathNegativeSum() {
        int n = -12;
        int[] array = {12, 3, 0, -24};
        int[][] expectedResult = {{12, -24}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testSumOfTwoHappyPathZeros() {
        int n = 3;
        int[] array = {0, 0, 0, 0};
        int[][] expectedResult = {};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(6)
    public void testSumOfTwoHappyPathAllZeros() {
        int n = 0;
        int[] array = {0, 0};
        int[][] expectedResult = {{0,0}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoEmpty() {
        int n = 12;
        int[] array = {};
        int[][] expectedResult = {{}};

        SumOfTwo sumOfTwo = new SumOfTwo();
        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithms(array, n);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
