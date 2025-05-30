import java.util.Scanner;

public class week {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to determine the days");
        int days = input.nextInt();

        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sartuday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        
            default:
                if(days > 7){
                    System.out.println("Please enter a number ranging from one to seven ");
                }
                break;
        }

        input.close();
    }
    
}

