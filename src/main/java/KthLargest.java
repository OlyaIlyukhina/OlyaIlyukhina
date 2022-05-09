public class KthLargest {

    public int kthLargestAlgorithm(int[] array, int k) {
        int result = 0;
        int[] sorted = {};

        if (k > 0 && k <= array.length) {

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int count;

                    if (array[i] < array[j]) {
                        count = array[i];
                        array[i] = array[j];
                        array[j] = count;
                    }
                }
            }
            sorted = array;

            return sorted[k - 1];
        }

        return result;
    }
}
