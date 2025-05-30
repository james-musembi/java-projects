public class patternten{
    public static void invert(int n) {
        System.out.println("\n");
        for (int x = n; x >= 1; x--) { 
            for (int y = 1; y <= n - x; y++) {
                System.out.print(" "); 
            }
            for (int y= 1; y <= x; y++) {
                System.out.print("* ");  
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int n = 5; 
        invert(n);  
    }
}
