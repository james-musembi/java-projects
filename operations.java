import java.util.Scanner;
public class operations {
    public static void main(String[] args){
        System.out.println("\n");
        Scanner input = new Scanner(System.in);
        int num1 = 70;
        System.out.println(num1);
        int num2 = 90;
        System.out.println(num2);
        System.out.println("Enter an operator:");
        String op = input.next();
        input.close();
        switch (op) {
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
        
            default:
                System.out.println("Please enter a valid operator");
                break;
        }
    }
}

