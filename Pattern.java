public class Pattern{

    public static void printTriangle(int n) {
        System.out.println("\n");
        for (int i = 1; i <= n; i++) {  
            for (int j = 1; j <= i; j++) { 
                System.out.print("* ");  
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int n = 5;  
        printTriangle(n); 
    }
}

