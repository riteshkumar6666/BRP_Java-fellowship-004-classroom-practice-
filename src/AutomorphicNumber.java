//***BRP-java fellowship_004***
//wap to check number is Automorphic or not in java
//5*5=25, 25*25=625(Automorphic number)

import java.util.Scanner;
public class AutomorphicNumber
{

    static boolean isaAutomorphic(int num)
    {
        Scanner sc=new Scanner(System.in);
        num= sc.nextInt();
        int square = num * num;

        while (num > 0)
        {

            if (num % 10 != square % 10)

                return false;
            // square by dividing them by 10
            num = num/10;
            square = square/10;
        }
        return true;
    }

    public static void main(String args[])
    {


        System.out.println(isaAutomorphic(525) ? "Automorphic " : "Not Automorphic");
    }
}

