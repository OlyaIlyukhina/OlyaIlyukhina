import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {

    @Test
    public void testStringToNumbersAndSpacesHappyPath() {
        String s = "sdadg9 0 1 3 hfhsfhp8";
        String expectedResult = "9 0 1 3 8";

        StringToNumbersAndSpaces stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpacesAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToNumbersAndSpacesNoNumbers() {
        String s = "sd ad ghfh sfh p";
        String expectedResult = "    ";

        StringToNumbersAndSpaces stringToNumbersAndSpaces = new StringToNumbersAndSpaces();
        String actualResult = stringToNumbersAndSpaces.stringToNumbersAndSpacesAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
