import java.util.Scanner;
public class smallest {
    public static int Smallest (int num1, int num2, int num3) {
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3) {
            return num2;
        } else {
            return num3;
        }
    }
    public static void main(String[] args){
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter num 1: ");
        num1 = input.nextInt();
        System.out.println("Enter num 2: ");
        num2 = input.nextInt();
        System.out.println("Enter num 3: ");
        num3 = input.nextInt();
        int smallest = Smallest(num1, num2, num3);
        System.out.println("the smallest number is: " + smallest);
        input.close();
    }
}
