public class StringToNumbers {

    public int[] returnArrayAlgorithm(String s) {
        int[] error = new int[]{};

        if(!s.isEmpty()) {

            String[] split = s.split(", ");
            int[] result = new int[split.length];

            for (int i = 0; i < split.length; i++) {
                result[i] = Integer.parseInt(split[i]);
            }

            return result;
        }

        return error;
    }
}
