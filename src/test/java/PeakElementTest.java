import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Test
    @Order(1)
    public void testPeakElementHappyPath() {
        int[] array = new int[]{3, 2, 7, 5, 1, 9, 23, 1};
        int[] expectedResult = new int[]{3, 7, 23};

        PeakElement peakElement = new PeakElement();
        //int[] actualResult = peakElement.peakElementAlgorithm(array);

        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(2)
    public void testPeakElementHappyPathNegative() {
        int[] array = new int[]{-3, 2, -7, 5, 1, -9, 23, 1};
        int[] expectedResult = new int[]{2, 5, 23};

        PeakElement peakElement = new PeakElement();
        //int[] actualResult = peakElement.peakElementAlgorithm(array);

        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(3)
    public void testPeakElementHappyPathZero() {
        int[] array = new int[]{0, 2, -7, 0, 1, 0, 23, 1};
        int[] expectedResult = new int[]{2, 1, 23};

        PeakElement peakElement = new PeakElement();
        //int[] actualResult = peakElement.peakElementAlgorithm(array);

        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(4)
    public void testPeakElementHappyPathDuplicates() {
        int[] array = new int[]{3, 3, 3, 5, 3, 3, 3, 3};
        int[] expectedResult = new int[]{5};

        PeakElement peakElement = new PeakElement();
        //int[] actualResult = peakElement.peakElementAlgorithm(array);

        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    @Order(5)
    public void testPeakElementSameValue() {
        int[] array = new int[]{3, 3, 3, 3, 3, 3, 3, 3};
        int[] expectedResult = new int[]{};

        PeakElement peakElement = new PeakElement();
        //int[] actualResult = peakElement.peakElementAlgorithm(array);

        //Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
