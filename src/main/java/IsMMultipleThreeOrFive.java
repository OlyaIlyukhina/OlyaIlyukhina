public class IsMMultipleThreeOrFive {

    public String IsMMultipleThreeOrFiveAlgorithm(int m) {
        String message = "Good number";

        if (m % 3 == 0 && m % 5 == 0) {

            return message;
        } else if (m % 5 != 0 && m % 3 == 0) {

            return message = "Bad Number";
        } else if (m % 3 != 0 && m % 5 == 0) {

            return message = "Poor Number";
        } else {

            return message = "-1";
        }
    }
}
