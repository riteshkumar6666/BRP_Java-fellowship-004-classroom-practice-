//***BRP-java fellowship_004***
//wap to check number is buzz or not in java
import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if (num%7==0 || num%10==7)
        {
            System.out.println("Buzz number "+num);
        }
        else
        {
            System.out.println("not a buzz number "+num);
        }
    }
}
