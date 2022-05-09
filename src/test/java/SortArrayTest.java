import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Test
    @Order(1)
    public void testSortArrayHappyPath() {
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testSortArrayHappyPathNegative() {
        int[] array = {-4, 3, 7, 12, -5, 2, 9, 4, -12};
        int[] expectedResult = {-12, -5, -4, 2, 3, 4, 7, 9, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testSortArrayHappyPathZero() {
        int[] array = {0, 3, 7, 12, -5, 2, 9, 4, -12};
        int[] expectedResult = {-12, -5, 0, 2, 3, 4, 7, 9, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testSortArrayHappyPathDuplicates() {
        int[] array = {0, 3, 7, 12, 0, 2, 4, 4, -12};
        int[] expectedResult = {-12, 0, 0, 2, 3, 4, 4, 7, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testSortArrayEmpty() {
        int[] array = {};
        int[] expectedResult = {};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(6)
    public void testSortArrayDuplicatesOnly() {
        int[] array = {9, 9, 9, 9, 9};
        int[] expectedResult = {9, 9, 9, 9, 9};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
