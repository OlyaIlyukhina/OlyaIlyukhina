public class NegativeOnTheRight {

    public int[] negativeOnTheRightAlgorithm(int[] array) {
        int[] result = new int[array.length];
        int count = result.length - 1;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[count] = array[i];
                count--;
            } else if (array[i] > 0) {
                result[count2] = array[i];
                count2++;
            }
        }

        return result;
    }
}
