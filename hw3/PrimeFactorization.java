package hw3;

public class PrimeFactorization {
    public static void primeFactorization(int n) {
        primeFactorizationHelper(n, 2);
    }
    
    public static void primeFactorizationHelper(int n, int factor) {
        if (n == 1) {
            return;
        }
        if (n % factor == 0) {
            System.out.print(factor + " ");
            primeFactorizationHelper(n / factor, factor);
        } else {
            primeFactorizationHelper(n, factor + 1);
        }
    }
    
}
