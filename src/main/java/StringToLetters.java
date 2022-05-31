public class StringToLetters {

    public String stringToLettersAlgorithm(String s) {
        String result = "";

        if(!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 65 && s.charAt(i) <= 90
                        || s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    result = result + s.charAt(i);
                }
            }
        }

        return result;
    }
}
