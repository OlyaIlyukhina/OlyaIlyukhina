import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KthLargestTest {

    @Test
    public void testKthLargestHappyPath() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 12};
        int k = 3;
        int expectedResult = 9;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

   @Test
   public void testKthLargestHappyPathNegative() {
       int[] array = new int[]{-4, -3, 7, -12, 5, 0, 9, 12};
       int k = 3;
       int expectedResult = 7;

       KthLargest kthLargest = new KthLargest();
       int actualResult = kthLargest.kthLargestAlgorithm(array, k);

       Assertions.assertEquals(expectedResult, actualResult);
   }

    @Test
    public void testKthLargestHappyPathFirst() {
        int[] array = new int[]{-4, -3, 7, -12, 5, 0, 9, 12};
        int k = 1;
        int expectedResult = 12;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestIndexZero() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 12};
        int k = 0;
        int expectedResult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestIndexNegative() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 12};
        int k = -1;
        int expectedResult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testKthLargestIndexOutOfBound() {
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 12};
        int k = 110;
        int expectedResult = 0;

        KthLargest kthLargest = new KthLargest();
        int actualResult = kthLargest.kthLargestAlgorithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
