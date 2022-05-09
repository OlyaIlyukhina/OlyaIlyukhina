public class NumberOccurrences {

    public static int[][] numberOccurrencesAlgorithm(int[] array) {
        int[][] result = {{}};
        int[] localArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            localArray[i] = array[i];
        }
        int count = 0;
        int count1 = 0;

        if (localArray.length > 0) {
            for (int i = 0; i < localArray.length; i++) {
                for (int j = i + 1; j < localArray.length; j++) {
                    if (localArray[i] == localArray[j] && localArray[j] != Integer.MAX_VALUE) {
                        localArray[j] = Integer.MAX_VALUE;
                        count++;
                    }
                }
            }

            result = new int[array.length - count][2];

            for (int i = 0; i < array.length; i++) {
                count = 1;
                if (array[i] != Integer.MAX_VALUE) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[j] = Integer.MAX_VALUE;
                            count++;
                        }
                    }
                    result[count1][0] = array[i];
                    result[count1][1] = count;
                    count1++;
                }

            }

            return result;
        }

        return result;
    }
}
