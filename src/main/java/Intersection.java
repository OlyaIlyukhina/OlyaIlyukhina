public class Intersection {

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        int[] result = {};
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    count++;
                }
            }
        }

        result = new int[count];

        count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    result[count] = array1[i];
                    count++;
                }
            }
        }
//        asfdbksd

        return result;
    }
}
