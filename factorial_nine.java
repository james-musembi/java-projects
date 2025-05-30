public class factorial_nine {
    public static void main(String[] args) {
        int number = 9;
        int factorial = 1;
        int i = number;
        
        while (i > 1) {
            factorial *= i;
            i--;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

