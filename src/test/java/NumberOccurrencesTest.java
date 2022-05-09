import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class NumberOccurrencesTest {

    @Test
    @Order(1)
    public void testNumberOccurrencesHappyPath() {

        int[] array = {3, 2, 5, 3, 1, 5, 4, 2, 1, 4, 5, 3, 2, 1, 4, 5, 3, 2, 1};
        int[][] expectedResult = {{3, 4}, {2, 4}, {5, 4}, {1, 4}, {4, 3}};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testNumberOccurrencesHappyPathNegativeAndZero() {

        int[] array = {-3, 2, 5, -3, 0, 5, 4, 2, 0, 4, 5, -3, 2, 0, 4, 5, -3, 2, 0};
        int[][] expectedResult = {{-3, 4}, {2, 4}, {5, 4}, {0, 4}, {4, 3}};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testNumberOccurrencesHappyPathNoDuplicates() {

        int[] array = {-3, 2, 5, 0, 1};
        int[][] expectedResult = {{-3, 1}, {2, 1}, {5, 1}, {0, 1}, {1, 1}};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testNumberOccurrencesEmptyArray() {

        int[] array = {};
        int[][] expectedResult = {{}};

        NumberOccurrences numberOccurrences = new NumberOccurrences();
        int[][] actualResult = numberOccurrences.numberOccurrencesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
