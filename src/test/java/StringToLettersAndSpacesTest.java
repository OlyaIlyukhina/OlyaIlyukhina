import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

    @Test
    public void stringToLettersAndSpacesTestHappyPath() {
        String s = "Lkdsdff uehfsdfsd 923892ddgUJNGUYF";
        String expectedResult = "Lkdsdff uehfsdfsd ddgUJNGUYF";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpacesAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToLettersAndSpacesTestEmpty() {
        String s = "";
        String expectedResult = "";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpacesAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void stringToLettersAndSpacesTestNoLettersOrSpaces() {
        String s = "132545758697946322435```";
        String expectedResult = "";

        StringToLettersAndSpaces stringToLettersAndSpaces = new StringToLettersAndSpaces();
        String actualResult = stringToLettersAndSpaces.stringToLettersAndSpacesAlgorithm(s);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
