public class OddIndices {
    public int[] oddIndicesAlgorithm(int[] array) {
        int[] result = new int[array.length / 2];
        int count = 0;

        for (int i = 1; i < array.length; i = i + 2) {

                result[count] = array[i];
                count++;
            }

        return result;
    }
}
