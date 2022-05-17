import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToNumbersDeleteTest {

    @Test
    @Order(1)
    public void testStringToNumbersDeleteHappyPath() {
        String s = "hsdfhs9821721gsdsasgd1!!09  idfh";
        String expectedResult = "9821721109";

        StringToNumbersDelete stringToNumbersDelete = new StringToNumbersDelete();
        String actualResult = stringToNumbersDelete.stringToNumbersDeleteAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testStringToNumbersDeleteHappyPathOneDigit() {
        String s = "                 1                ";
        String expectedResult = "1";

        StringToNumbersDelete stringToNumbersDelete = new StringToNumbersDelete();
        String actualResult = stringToNumbersDelete.stringToNumbersDeleteAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersDeleteEmpty() {
        String s = "";
        String expectedResult = "";

        StringToNumbersDelete stringToNumbersDelete = new StringToNumbersDelete();
        String actualResult = stringToNumbersDelete.stringToNumbersDeleteAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersDeleteOnlyNumbers() {
        String s = "1234567890";
        String expectedResult = "1234567890";

        StringToNumbersDelete stringToNumbersDelete = new StringToNumbersDelete();
        String actualResult = stringToNumbersDelete.stringToNumbersDeleteAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
