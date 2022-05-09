import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SumArrayTest {

    @Test
    @Order(1)
    public void testSumArrayHappyPathPositive() {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSumArrayHappyPathNegative() {
        int[] array = new int[]{-7, -3};
        int expectedResult = - 10;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSumArrayEmpty() {
        int[] array = new int[]{};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSumArrayZero() {
        int[] array = new int[]{0, 0, 0, 0};
        int expectedResult = 0;

        SumArray sumArray = new SumArray();
        int actualResult = sumArray.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
