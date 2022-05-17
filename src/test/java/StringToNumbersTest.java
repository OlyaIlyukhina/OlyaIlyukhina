import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {

    @Test
    @Order(1)
    public void testReturnArrayHappyPath() {

        String s = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.returnArrayAlgorithm(s);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testReturnArrayHappyPathNegative() {

        String s = "-1, 2, -3, 4, 0";
        int[] expectedResult = {-1, 2, -3, 4, 0};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.returnArrayAlgorithm(s);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testReturnArrayEmpty() {

        String s = "";
        int[] expectedResult = {};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.returnArrayAlgorithm(s);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
