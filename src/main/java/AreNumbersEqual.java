public class AreNumbersEqual {

    public int areNumbersEqualAlgorithm(int n1, int n2) {
        int result = 0;

        if(n1 == n2) {
            return result;
        } else if(n1 < n2) {
            return result = -1;
        } else if(n1 > n2) {
            return result = 1;
        }
        return result;
    }
}
