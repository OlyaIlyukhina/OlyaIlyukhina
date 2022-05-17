public class StringToNumbersDelete {

    public String stringToNumbersDeleteAlgorithm(String s) {
        String result = "";
        if (!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' || s.charAt(i) == '2'
                        || s.charAt(i) == '3' || s.charAt(i) == '4'
                        || s.charAt(i) == '5' || s.charAt(i) == '6'
                        || s.charAt(i) == '7' || s.charAt(i) == '8'
                        || s.charAt(i) == '9' || s.charAt(i) == '0') {
                    result = result + s.charAt(i);
                }
            }

            return result;
        }

        return result;
    }
}
