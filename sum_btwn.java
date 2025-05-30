public class sum_btwn {
    public static void main(String[] args) {
        int x = 23;
        int y = 67;
        int totalSum = 0;

        for (int i = x; i <= y; i++) {
            int number = i;
            while (number > 0) {
                totalSum += number % 10;  
                number /= 10;            
            }
        }

        System.out.println("Total sum of all digits between " + x + " and " + y + " is: " + totalSum);
    }
}

