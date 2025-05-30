import java.io.PrintStream;
import java.util.Scanner;

public class evenodd {
    public static void main(String[]args){
        Scanner Scanner=new Scanner(System.in);
        ((PrintStream) system.out).print("Enter a number:");
      int number=Scanner.nextInt();
      if(number% 2 == 0){
        ((PrintStream) system.out).println(number+"is Even.");
      } else{
        System.out.println(number + "is odd.");
      } 
      Scanner.close();
    }
    
}
