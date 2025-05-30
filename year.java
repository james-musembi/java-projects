import java.util.Scanner;
public class year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an year: ");
        int year;
        try{
            year = sc.nextInt();
            boolean isleapyear = false;
            if(year % 4 == 0){
                if(year % 100 != 0){
                    isleapyear = true;
                }
            }
            else{
                if(year % 400 == 0){
                    isleapyear = true;
                }
            }
            System.out.println("Year " + year + " is ");
            System.out.println("Leap year" + (isleapyear ? " " : " No"));
        }
        catch(NumberFormatException e){
            System.out.println("Invalid input. please enter a valid number.");
        }
        sc.close();
    }
}