import java.util.Scanner;
public class num_check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = sc.nextInt();

        if(x > 0){
            System.out.println("This number is positive");
        }

        else if(x == 0){
            System.out.println("Zero number");
        }

        else{
            System.out.println("The number is negative");
        }

        sc.close();

        
    }
    
}
