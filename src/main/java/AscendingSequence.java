public class AscendingSequence {

    public int[] ascendingSequenceAlgorithm(int start, int end, int step) {
        //0, 1, 2, 3, 4, 5
        if (step > 0 && start < end) {
            int[] result = new int[(end - start + 1) / step];

            //int j = 0;

            //for (int i = start; i <= end; i += step) {
            //    result[j] = i;
            //    j++;
            //}

            for (int i = 0; i < result.length; i ++) {
                if(start <= end) {
                    result[i] = start;
                    start += step;
                }
            }

            return result;
        }

        return new int[]{};
    }

}
