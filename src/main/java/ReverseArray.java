public class ReverseArray {

    public int[] reverseArrayAlgorithm(int[] array) {
        int[] result = new int[array.length];
        if (array.length == 0) {

            return result;
        }

        int count = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            result[count] = array[i];
            count--;
        }

        return result;
    }
}
