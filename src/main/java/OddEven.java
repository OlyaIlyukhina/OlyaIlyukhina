public class OddEven {

    public String oddEvenAlgorithm(long n) {
        String result = "";

        if(n < Integer.MIN_VALUE || n > Integer.MAX_VALUE){
            result = "Undefined";
        } else if(Math.abs(n) % 2 == 0) {
            result = "Even";
        } else if(Math.abs(n) % 2 == 1) {
            result = "Odd";
        }
        return result;
    }
}
