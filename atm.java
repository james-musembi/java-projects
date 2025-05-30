import java.util.Scanner;
public class atm {
    public static void main(String[] args){

        double balance = 100.00;

        while (true) {
            Scanner input = new Scanner(System.in);
            String[] option = {"1. Deposit money", "2. Check balance", "3. Withdraw money", "4. Exit"};
            for(String options : option){
                System.out.println(options);
            }
            System.out.println("Choose Any option ");
            String choose = input.next();
            switch (choose) {
                case "1":
                    System.out.println("How much are you depositing: ");
                    double amount = input.nextInt();
                    if(amount > 0){
                        balance += amount;
                        System.out.println("Deposited " + amount + " your new balance is " + balance);
                    }
                    else{
                        System.out.println("Please Enter a valid digit");
                    }
                    break;
                case "2":
                    System.out.println("Your balance is " + balance);
                    break;
                case "3":
                    System.out.println("How much are you withdrawing: ");
                    double withdraw = input.nextInt();
                    if(withdraw > 0){
                        balance -= withdraw;
                        System.out.println("Withdrawn " + withdraw + " your new balance is " + balance);
                    }
                    else{
                        System.out.println("Please Enter a valid digit");
                    }
                    break;
                case "4":
                    System.out.println("Exiting... Thank you");
                    input.close();
                    break;
            
                default:
                    System.out.println("Error! Please enter a valid choice");
                    break;
            }

        }
        

    }
    
}