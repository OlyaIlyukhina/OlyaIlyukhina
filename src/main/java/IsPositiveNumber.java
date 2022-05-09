public class IsPositiveNumber {

    public boolean isPositiveNumberAlgorithm(int n) {
        boolean positive = true;

        if(n < 0) {
            positive = false;
        }

        return positive;
    }
}
