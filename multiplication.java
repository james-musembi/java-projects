public class multiplication {
    // Method to generate and print the multiplication table
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println(); // Move to the next line
        }
    }
    
    public static void main(String[] args) {
        printMultiplicationTable();
    }
}