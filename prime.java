public class prime {
    public static void main(String[] args) {
        int num = 2; // Start checking for prime from 2
        do {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 100);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int divisor = 2;
        do {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        } while (divisor <= Math.sqrt(n));
        return true;
    }
}

