import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class BiggerValueTest {

    @Test
    @Order(1)
    public void biggerValueHappyPath() {

    int n1 = 3333;
    int n2 = 9999;
    int expectedResult = 9999;

    BiggerValue biggerValue = new BiggerValue();
    int actualResult = biggerValue.biggerValueAlgorithm(n1, n2);

    Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void biggerValueHappyPathNegative() {

        int n1 = -3333;
        int n2 = -9999;
        int expectedResult = -3333;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void biggerValueEqual() {

        int n1 = 3333;
        int n2 = 3333;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void biggerValueZero() {

        int n1 = 0;
        int n2 = 3333;
        int expectedResult = 3333;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void biggerValueZeroBoth() {

        int n1 = 0;
        int n2 = 0;
        int expectedResult = 0;

        BiggerValue biggerValue = new BiggerValue();
        int actualResult = biggerValue.biggerValueAlgorithm(n1, n2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
