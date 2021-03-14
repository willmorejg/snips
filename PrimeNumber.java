public class PrimeNumber {
    public static void main(String[] args) {
        int values[] = {0, 1, 2, 3, 5, 7, 8, 10, 11, 13, 14, 17, 19, 20, 21, 22, 23, 29, 31};

        for(int v : values) {
	    String prime = isPrime(v) ? "is" : "is NOT";
            System.out.println(String.format("%o %s prime", v, prime));
        }
    }

    public static boolean isPrime(int value) {
        boolean prime = true;

        if(value == 0 || value == 1) {
            prime = false;
        } else {
            int half = value / 2;
            for(int c = 2; c <= half; c++) {
                prime = value % c != 0;
                if(!prime) {
                    break;
                }
            }
        }

        return prime;
    }
}
