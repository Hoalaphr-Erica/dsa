package hw3;

public class PrintBinary {
    public static void printBinary(int n) {
        if (n > 1) {
            printBinary(n / 2);
        }
        System.out.print(n % 2);
    }
    
}
