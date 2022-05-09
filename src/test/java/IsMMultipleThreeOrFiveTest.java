import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsMMultipleThreeOrFiveTest {

    @Test
    public void testIsMMultipleThreeOrFiveTestHappyPathBoth() {
        int m = 15;
        String expectedResult = "Good number";

        IsMMultipleThreeOrFive isMMultipleThreeOrFive = new
                IsMMultipleThreeOrFive();
        String actualResult = isMMultipleThreeOrFive.
                IsMMultipleThreeOrFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultipleThreeOrFiveTestHappyPathOnlyThree() {
        int m = 12;
        String expectedResult = "Bad Number";

        IsMMultipleThreeOrFive isMMultipleThreeOrFive = new
                IsMMultipleThreeOrFive();
        String actualResult = isMMultipleThreeOrFive.
                IsMMultipleThreeOrFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultipleThreeOrFiveTestHappyPathOnlyFive() {
        int m = 20;
        String expectedResult = "Poor Number";

        IsMMultipleThreeOrFive isMMultipleThreeOrFive = new
                IsMMultipleThreeOrFive();
        String actualResult = isMMultipleThreeOrFive.
                IsMMultipleThreeOrFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsMMultipleThreeOrFiveTestHappyPathNeither() {
        int m = 52;
        String expectedResult = "-1";

        IsMMultipleThreeOrFive isMMultipleThreeOrFive = new
                IsMMultipleThreeOrFive();
        String actualResult = isMMultipleThreeOrFive.
                IsMMultipleThreeOrFiveAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
