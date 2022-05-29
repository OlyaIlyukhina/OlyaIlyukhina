import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

    @Test
    public void testStringToLettersHappyPath() {
        String s = "91839hddjfbieuty394  38424R";
        String expectedResult = "hddjfbieutyR";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersHappyPathEmpty() {
        String s = "";
        String expectedResult = "";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testStringToLettersHappyPathNoLetters() {
        String s = "123571625415484 37174     748364=]";
        String expectedResult = "";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
