public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] array, int n1, int n2) {
        int[] result = {};

        if (n2 < array.length && n2 >= n1 && n1 >= 0) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int sum = 0;


            if (n1 < array.length && n2 < array.length && n1 >= 0) {
                for (int i = n1; i <= n2; i++) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                    if (min > array[i]) {
                        min = array[i];
                    }
                    sum = sum + array[i];
                }
            }
            int ave = (int) Math.round(sum / (n2 - n1 + 1.0));

            return result = new int[]{min, max, ave};
        }

        return result;
    }
}
