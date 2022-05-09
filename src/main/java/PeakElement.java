public class PeakElement {

    public int[] peakElementAlgorithm(int[] array) {
        int[] result = {};
        int count = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if(i == 0 && array[i] > array[i + 1]) {
                    count++;
                }
                if(i == array.length - 1 && array[i] > array[i - 1]) {
                    count++;
                }
                for (int j = i + 1; j < array.length; j++) {
                    if(array[i] > array[j] && array[i] > array[i -1]) {
                        count++;
                    }
                }
                    }

            result = new int [count];
                }

        return result;
    }


}

